<?php

require_once "../../Database/database.php";
require_once "delete.php";
require_once "insert.php";
require_once "select.php";
require_once "update.php";

$conn = getDatabase();
$tableName = "collegeStaff";
$result = "";
$addBook = false;
$update = false;
$search = '';
$search = '';
$limit = null;
$optins = optinMaping('roles', '1=1');
$updateData = array();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    if (isset($_POST['addUser'])) {
        $addBook = true;
    } else  if (isset($_POST['update']) && $_POST['update'] === 'update') {

        $sql = "SELECT * FROM {$tableName} WHERE staffId = {$_POST['staffId']}";
        $kal = mysqli_query($conn, $sql);
        $updateData = mysqli_fetch_assoc($kal);
        $update = true;
    } else if (isset($_POST['deleteBtn']) && $_POST['deleteBtn'] === 'delete') {
        $keys = "rollId = {$_POST['rollId']}";
        $isDelete = deleteData($tableName, $keys);
        if ($isDelete) {
            echo "<script>
        alert('Data delete successfully !!!');
    </script>";
        } else {
            echo "<script>
        alert('Data can't deleted !!!');
    </script>";
        }
    } else if (isset($_POST['searchbtn']) && $_POST['searchbtn'] === 'searchbtn') {
        if (isset($_POST['search'])) {
            $search = trim($_POST['search']);
        }
        if (isset($_POST['column'])) {
            if ($_POST['column'] !== 'all')
                $limit = trim($_POST['column']);
        }
    } else if (isset($_POST['insertUser']) && $_POST['insertUser'] === 'insertUser') {

        $data = array();
        unset($_POST['insertUser']);

        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[$key] = "'" . $value . "'";
        }

        $isInsert = insertData($tableName, $data);
        if ($isInsert) {
            echo "<script>
        alert('Data inserted successfully !!!');
        window.location.href = 'index.php';
    </script>";
        } else {
            echo "<script>
        alert('Data can't inserted !!!');
        window.location.href = 'index.php';
    </script>";
        }
    }else if (isset($_POST['updateUser']) && $_POST['updateUser'] === 'updateUser') {

        $data = array();
		$where = "staffId = {$_POST['staffId']}";
        unset($_POST['updateUser'],$_POST['staffId']);

        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[] = "{$key} = '{$value}'";
        }

        $isInsert = updateData($tableName, $data,$where);
        if ($isInsert) {
            echo "<script>
        alert('Data updated successfully !!!');
        window.location.href = 'index.php';
    </script>";
        } else {
            echo "<script>
        alert('Data can't updated !!!');
        window.location.href = 'index.php';
    </script>";
        }
    }
}

$sql = "SELECT s.*, r.* FROM {$tableName} s  LEFT JOIN roles r ON s.roleId = r.rollId ";
if (!empty($search)) {
    $sql .= " WHERE r.rollName LIKE '%{$search}%' ";
    $sql .= "OR s.firstName LIKE '%{$search}%' ";
    $sql .= "OR s.secondName LIKE '%{$search}%' ";
    $sql .= "OR s.lastName LIKE '%{$search}%' ";
    $sql .= "OR s.email LIKE '%{$search}%' ";
}

if (!empty($limit)) {
    $sql .= "  LIMIT {$limit}";
}
$kal = mysqli_query($conn, $sql);
$row = mysqli_affected_rows($conn);
$rowData = '';

if ($row === 0) {
    $result = "No role found";
} else {
    while ($data = mysqli_fetch_assoc($kal)) {
        $result .= "<tr>
                    <td>{$data['staffId']}</td>
                    <td>{$data['firstName']}</td>
                    <td>{$data['secondName']}</td>
                    <td>{$data['lastName']}</td>
                    <td>{$data['email']}</td>
                    <td>{$data['rollName']}</td>
					<td> " .
            '<form method="POST" class="btns">
                         <input type="hidden" name="staffId" value="' . $data["staffId"] . '">
						<button type="submit" name="update" value="update" class="updatebtn">Update</button>
						<button type="submit" name="deleteBtn" value="delete" class="deletebtn">Delete</button>
					</form>
                    </td>
                </tr>';
    }
}

?>

<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Role Master</title>
    <link rel="stylesheet" href="..\..\Assignment_3\css\main.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f9f9f9;
        }
    </style>
</head>

<body>
    <div class="book">

        <div class="addbook">
            <form action="" method="POST">
                <input type="hidden" name="addUser" value="addUser">
                <button type="submit" name="addbook" class="searchbtn updatebtn">Add New</button>
                <a class="searchbtn deletebtn redirectBtn" href="roles.php">Show Roles</a>
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
                    </select>
            </div>
            <div>

                <input type="text" name="search" value="<?php if (!empty($search)) echo $search; ?>" placeholder="Search by Name.....">
                <button type="submit" name="searchbtn" value="searchbtn" class="searchbtn updatebtn">Search</button>
                </form>
            </div>
        </div>
        <table class="employee-table">
            <thead>
                <tr>
                    <th>staff Id</th>
                    <th>First Name</th>
                    <th>Second Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>

                <?php echo $result; ?>
            </tbody>
        </table>



    </div>
    <?php if ($addBook || $update): ?>
        <div class="AddForm">
            <div>
                <?php if ($update): ?>
                    <h3>Update staff</h3>
                    <form method="POST">
                    <?php endif; ?>
                    <?php if ($addBook): ?> <h2>Add New staff</h2>
                        <form method="POST">
                        <?php endif; ?>

                        <input type="hidden" name="staffId" value="<?php if (isset($updateData['staffId'])) echo $updateData['staffId']; ?>" placeholder="Enter staff Id" required>

                        <div>
                            <p>Ente first name</p>
                            <input type="text" name="firstName" value="<?php if (isset($updateData['firstName'])) echo $updateData['firstName']; ?>" placeholder="Enter first name" required>
                        </div>

                        <div>
                            <p>Enter second name</p>
                            <input type="text" name="secondName" value="<?php if (isset($updateData['secondName'])) echo $updateData['secondName']; ?>" placeholder="Enter second name" required>
                        </div>

                        <div>
                            <p>Enter last name</p>
                            <input type="text" name="lastName" value="<?php if (isset($updateData['lastName'])) echo $updateData['lastName']; ?>" placeholder="Enter last name" required>
                        </div>

                        <div>
                            <p>Enter email</p>
                            <input type="text" name="email" value="<?php if (isset($updateData['email'])) echo $updateData['email']; ?>" placeholder="Enter email" required>
                        </div>


                        <div>
                            <p>select staff role</p>
                            <select name="roleId" placeholder="Enter emp type" required>
                                <option disabled selected>select emp type</option>
                                <?php echo $optins; ?>
                            </select>
                        </div>

                        <?php if ($update): ?>
                            <button type="submit" name="updateUser" value="updateUser" id="btn">Update</button>

                        <?php else: ?>
                            <button type="submit" name="insertUser" value="insertUser" id="btn">Submit</button>
                        <?php endif; ?>
                        </form>

            </div>
        </div>

    <?php endif; ?>

</body>

<!-- CREATE TABLE collegeStaff(
    staffId INT(5) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(255),
    secondName VARCHAR(255),
    lastName VARCHAR(255),
    email VARCHAR(255),
    roleId INT(5),
	createdAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
	FOREIGN KEY(roleId) REFERENCES roles(rollId) ON UPDATE CASCADE ON DELETE SET NULL
); -->

</html>