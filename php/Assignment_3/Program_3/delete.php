<?php
require_once "../../Database/database.php";
$conn = getDatabase();
$tableName = "employee";
$result = "";

if ($_SERVER['REQUEST_METHOD'] === 'GET') {

	echo "<script>
        const isDelete =confirm ('Data delete successfully !!!');
		if(isDelete)
        window.location.href = 'index.php';
    </script>";


	$sql = "DELETE FROM {$tableName} WHERE emp_id = {$_GET['emp_id']}";

	try {
		$kal = mysqli_query($conn, $sql);

		if (mysqli_affected_rows($conn) !== 0) {
			echo "<script>
        alert('Data delete successfully !!!');
        window.location.href = 'index.php';
    </script>";
		} else {
			echo "<script>
        alert('Data can't deleted !!!');
        window.location.href = 'index.php';
    </script>";
		}
	} catch (Exception $e) {
		die($e->getMessage());
	}
}
