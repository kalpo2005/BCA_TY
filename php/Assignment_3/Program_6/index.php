<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "employee";
$result = "";
$addUser = false;
$detail = false;
$search = '';
$limit = null;


if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    if (isset($_POST['addnew'])) {
        $addUser = true;
    } else  if (isset($_POST['account']) && $_POST['account'] === 'account') {
		$sql = "SELECT * FROM {$tableName}"." WHERE emp_id = {$_POST['emp_id']}";
		$kal = mysqli_query($conn, $sql);
		$data = mysqli_fetch_assoc($kal);
		
		
		$userRow=" <tr>
                    <td>{$data['name']}</td>
                    <td>{$data['gender']}</td>
                    <td>{$data['emp_type']}</td>
                    <td>{$data['department']}</td>
					</tr>";
		$detail = true;
		
    } else if (isset($_POST['deleteBtn']) && $_POST['deleteBtn'] === 'delete') {
        $keys = "emp_id=" . $_POST['emp_id'];
        header("Location:delete.php?" . $keys);
		
    } else if (isset($_POST['searchbtn']) && $_POST['searchbtn'] === 'searchbtn') {
        if (isset($_POST['search'])) {
            $search = trim($_POST['search']);
        }
        if (isset($_POST['column'])) {
            if ($_POST['column'] !== 'all')
                $limit = trim($_POST['column']);
        }
    }
}

$sql = "SELECT * FROM {$tableName}";
if (!empty($search)) {
    $sql .= " WHERE name LIKE '%{$search}%' ";
    $sql .= " OR gender LIKE '%{$search}%' ";
    $sql .= " OR department LIKE '%{$search}%' ";
    $sql .= " OR emp_type LIKE '%{$search}%' ";
}

if (!empty($limit)) {
    $sql .= "  LIMIT {$limit}";
}

$kal = mysqli_query($conn, $sql);
$row = mysqli_affected_rows($conn);
$rowData = '';

if ($row === 0) {
    $result = "No user found";
} else {
    while ($data = mysqli_fetch_assoc($kal)) {
        $result .= "<tr>
                    <td>{$data['name']}</td>
                    <td>{$data['gender']}</td>
                    <td>{$data['emp_type']}</td>
                    <td>{$data['department']}</td>
					<td> " .
            '<form method="POST" class="btns">
                         <input type="hidden" name="emp_id" value="' . $data["emp_id"] . '">
						<button type="submit" name="account" value="account" class="updatebtn">Account</button>
						<button type="submit" name="deleteBtn" value="delete" class="deletebtn">Delete</button>
					</form>
                    </td>
                </tr>';
    }
}

?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Program 6</title>
    <link rel="stylesheet" href="..\css\main.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f9f9f9;
        }
    </style>
</head>

<body>

    <div class="emp">

        <div class="addemp">
            <form action="" method="POST">
                <input type="hidden" name="addnew" value="addUser">
                <button type="submit" name="adduser" class="searchbtn updatebtn">Add New</button>
            </form>
        </div>
        <div class="search">
            <div>
                <form action="" method="POST">
                    <span><strong>show Entries</strong></span>
                    <select name="column">
                        <option value="all" selected>All</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                    </select>
            </div>
            <div class="search">

                <input type="text" name="search" value="<?php if (!empty($search)) echo $search ?>" placeholder="Search by Name.....">
                <button type="submit" name="searchbtn" value="searchbtn" class="searchbtn updatebtn">Search</button>
                </form>
            </div>
        </div>
        <table class="employee-table">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Employee Type</th>
                    <th>Department</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>

                <?php echo $result; ?>
				
            </tbody>
        </table>


    </div>
    <?php if ($addUser): ?>
        <div class="AddForm">
            <div>
                <form method="POST" action="insert.php">
                    <div>
                        <p>Enter emp Id</p>
                        <input type="number" name="emp_id" placeholder="Enter emp Id" required>
                    </div>

                    <div>
                        <p>Enter emp name</p>
                        <input type="text" name="name" placeholder="Enter emp name" required>
                    </div>

                    <div>
                        <p>Enter emp gender</p>
                        <input type="radio" name="gender" value="male" checked>
                        Male

                        <input type="radio" name="gender" value="female">
                        Female

                        <input type="radio" name="gender" value="other">
                        Other
                    </div>

                    <div>
                        <p>select emp type</p>
                        <select name="emp_type" placeholder="Enter emp type" required>
                            <option disabled selected>select emp type</option>
                            <option>Manager</option>
                            <option>Tester</option>
                            <option>Designer</option>
                            <option>Developer</option>
                            <option>Driver</option>
                        </select>
                    </div>

                    <div>
                        <p>select emp department</p>
                          <select name="department" placeholder="Enter emp type" required>
                            <option disabled selected>select emp type</option>
                            <option>HR</option>
                            <option>Manager</option>
                            <option>Development</option>
                            <option>Testing</option>
                            <option>Marketing</option>
                        </select>

                    <div>
                        <button type="submit" name="addEmp" id="btn">Submit</button>
                    </div>
                </form>
            </div>
        </div>

    <?php endif; ?>
	
	  <?php if ($detail): ?>
        
       <table class="employee-table">
            <thead>
                   <tr>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Employee Type</th>
                    <th>Department</th>
                </tr>
            </thead>
            <tbody>
			
                <?php echo $userRow; ?>

            </tbody>
        </table>

    <?php endif; ?>

</body>


<!-- CREATE TABLE employee(
    emp_id INT(5) PRIMARY KEY,
    name VARCHAR(255),
    gender CHAR(10),
    emp_type VARCHAR(255),
    department VARCHAR(255)
); -->

</html>