<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "student_ragister";
$result = "";
$addUser = false;
$update = false;
$data = array();


if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    if (isset($_POST['addstudent']) && $_POST['addstudent'] === 'addstudent') {
        unset($_POST['addstudent']);

        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[$key] = "'" . $value . "'";
        }

        $keys = array_keys($data);

        $sql = "INSERT INTO {$tableName} (" . implode(',', $keys) . ") VALUES (" . implode(',', $data) . ")";
        unset($_POST['updatestudent']);

        try {
            if (!mysqli_query($conn, $sql))
                throw new Exception("Query Failed !!!");
            else
                echo "<script>
        alert('Data inserted successfully !!!');
        window.location.href = 'index.php';
    </script>";
        } catch (Exception $e) {
            echo "<script>
        alert({$e->getMessage()});
        window.location.href = 'index.php';
    </script>";
        }
    } else if (isset($_POST['updatestudent']) && $_POST['updatestudent'] === 'updatestudent') {
        unset($_POST['updatestudent']);
        if (empty($_POST['sNo'])) {
            echo "<script>
						alert('sNo is required !!!');
						window.location.href = 'index.php';
					</script>";
        }

        $where = $_POST['sNo'];
        unset($_POST['sNo']);
        foreach ($_POST as $key => $value) {
            if (!empty($value))
                $data[$key] = " $key = '$value' ";
        }
        $sql = "UPDATE {$tableName} SET " . implode(',', $data) . " WHERE sNo = " . $where;

        $update = mysqli_query($conn, $sql);
        if (!$update || mysqli_affected_rows($conn) === 0)
            echo "<script>
        alert('Data can't updated !!!');
        window.location.href = 'index.php';
    </script>";
        else
            echo "<script>
        alert('Data Successfully updated !!!');
        window.location.href = 'index.php';
    </script>";
    } else if (isset($_POST['deletestudent']) && $_POST['deletestudent'] === 'deletestudent') {
        if (empty($_POST['sNo'])) {
            echo "<script>
						alert('sNo is required !!!');
						window.location.href = 'index.php';
					</script>";
        }

        $where = $_POST['sNo'];
        $sql = "DELETE FROM {$tableName} WHERE sNo = " . $where;

        $update = mysqli_query($conn, $sql);
        if (!$update || mysqli_affected_rows($conn) === 0)
            echo "<script>
        alert('Data can't Deleted !!!');
        window.location.href = 'index.php';
    </script>";
        else
            echo "<script>
        alert('Data Successfully Deleted !!!');
        window.location.href = 'index.php';
    </script>";
    }
}

$sql = "SELECT * FROM {$tableName}";

$kal = mysqli_query($conn, $sql);
$row = mysqli_affected_rows($conn);
$rowData = '';

if ($row === 0) {
    $result = "No user found";
} else {
    while ($data = mysqli_fetch_assoc($kal)) {
        $result .= "<tr>
                    <td>{$data['sNo']}</td>
                    <td>{$data['sName']}</td>
                    <td>{$data['sAddress']}</td>
                    <td>{$data['sMobile']}</td>
                    <td>{$data['sDOB']}</td>
                </tr>";
    }
}
?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Program 3</title>
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
    <div class="AddForm">
        <div>
            <form method="POST" action="">
                <div>
                    <p>Enter student Id</p>
                    <input type="number" name="sNo" placeholder="Enter student Id" required>
                </div>

                <div>
                    <p>Enter student name</p>
                    <input type="text" name="sName" placeholder="Enter student name">
                </div>

                <div>
                    <p>Enter student adress</p>
                    <textarea name="sAddress" placeholder="Enter student adress" rows="3"></textarea>
                </div>


                <div>
                    <p>Enter student mobile</p>
                    <input type="number" name="sMobile" placeholder="Enter student mobile">
                </div>

                <div>
                    <p>Enter student DOB</p>
                    <input type="date" name="sDOB" placeholder="Enter student DOB">
                </div>

                <div>
                    <button type="submit" name="addstudent" value="addstudent" id="btn">Add</button>
                    <button type="submit" name="deletestudent" value="deletestudent" id="btn">Delete</button>
                    <button type="submit" name="updatestudent" value="updatestudent" id="btn">Update</button>
                </div>
            </form>
        </div>
    </div>

    <div class="AddForm student">
        <div>
            <h3>Student Information</h3>
        </div>
        <table class="employee-table">
            <thead>
                <tr>
                    <th>Student No</th>
                    <th>Student Name</th>
                    <th>Student address</th>
                    <th>Student mobile</th>
                    <th>Student dob</th>
                </tr>
            </thead>
            <tbody>

                <?php echo $result; ?>

            </tbody>
        </table>

    </div>


</body>


<!-- CREATE TABLE `student_ragister` (
 `sNo` int(5) DEFAULT NULL UNIQUE,
 `sName` varchar(20) DEFAULT NULL,
 `sAddress` varchar(50) DEFAULT NULL,
 `sMobile` int(10) DEFAULT NULL,
 `sDOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1
; -->

</html>