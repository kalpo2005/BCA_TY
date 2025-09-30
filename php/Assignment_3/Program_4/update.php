<?php
require_once "../../Database/database.php";
$conn = getDatabase();
$tableName = "book";
$result = "";

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

	$where = $_POST['bookId'];
	$data .=  " netAmmount = " . ($_POST['price'] *  $_POST['quantity']);
	foreach ($_POST as $key => $value) {
		if (!empty($value))
			$data .= " , $key = '$value' ";
	}

	$sql = "UPDATE {$tableName} SET " . $data . " WHERE bookId = " . $where;

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
}
