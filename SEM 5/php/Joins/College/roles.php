<?php

require_once "../../Database/database.php";
require_once "delete.php";
require_once "insert.php";
require_once "update.php";

$conn = getDatabase();
$tableName = "roles";
$result = "";
$addBook = false;
$update = false;
$search = '';
$limit = null;
$updateData = array();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    if (isset($_POST['addRole'])) {
        $addBook = true;
    } else  if (isset($_POST['update']) && $_POST['update'] === 'update') {

        $sql = "SELECT * FROM {$tableName} WHERE rollId = {$_POST['rollId']}";
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
    } else if (isset($_POST['insertRole']) && $_POST['insertRole'] === 'insertRole') {

        $data = array();
        unset($_POST['insertRole']);

        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[$key] = "'" . $value . "'";
        }

        $isInsert = insertData($tableName, $data);
        if ($isInsert) {
            echo "<script>
        alert('Data inserted successfully !!!');
        window.location.href = 'roles.php';
    </script>";
        } else {
            echo "<script>
        alert('Data can't inserted !!!');
        window.location.href = 'roles.php';
    </script>";
        }
    } else if (isset($_POST['updateRole']) && $_POST['updateRole'] === 'updateRole') {

        $data = array();
		$where = "rollId = {$_POST['rollId']}";
        unset($_POST['updateRole'],$_POST['rollId']);

        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[] = "{$key} = '{$value}'";
        }

        $isInsert = updateData($tableName, $data,$where);
        if ($isInsert) {
            echo "<script>
        alert('Data updated successfully !!!');
        window.location.href = 'roles.php';
    </script>";
        } else {
            echo "<script>
        alert('Data can't updated !!!');
        window.location.href = 'roles.php';
    </script>";
        }
    }
}

$sql = "SELECT * FROM {$tableName} ";
if (!empty($search)) {
    $sql .= " WHERE rollName LIKE '%{$search}%' ";
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
                    <td>{$data['rollId']}</td>
                    <td>{$data['rollName']}</td>
					<td> " .
            '<form method="POST" class="btns">
                         <input type="hidden" name="rollId" value="' . $data["rollId"] . '">
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
                <input type="hidden" name="addRole" value="addUser">
                <button type="submit" name="adduser" class="searchbtn updatebtn">Add New</button>
                <a class="searchbtn deletebtn redirectBtn" href="index.php">Home Page</a>
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
                    <th>Role Id</th>
                    <th>Role Name</th>
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
                    <h3>Update Role</h3>
                    <form method="POST">
                    <?php endif; ?>
                    <?php if ($addBook): ?> <h2>Add New Role</h2>
                        <form method="POST">
                        <?php endif; ?>

                        <input type="hidden" name="rollId" value="<?php if (isset($updateData['rollId'])) echo $updateData['rollId']; ?>" placeholder="Enter role Id" required>
                        <div>
                            <p>Enter Role name</p>
                            <input type="text" name="rollName" value="<?php if (isset($updateData['rollName'])) echo $updateData['rollName']; ?>" placeholder="Enter role name" required>
                        </div>

                        <?php if ($update): ?>
                            <button type="submit" name="updateRole" value="updateRole" id="btn">Update</button>

                        <?php else: ?>
                            <button type="submit" name="insertRole" value="insertRole" id="btn">Submit</button>
                        <?php endif; ?>
                        </form>

            </div>
        </div>

    <?php endif; ?>

</body>

<!-- CREATE TABLE roles(
    rollId INT(5) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    rollName VARCHAR(255),
	createdAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
); -->

</html>