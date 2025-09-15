<?php
require_once "../../Database/database.php";
$conn = getDatabase();
$tableName = "book";
$result = "";

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

	$where = $_POST['bookId'];
	$data = array();
	unset($_POST['rollOld']);

	foreach ($_POST as $key => $value) {
		if (!empty($value))
			$data[] = "$key = '$value'";
	}

	$sql = "UPDATE {$tableName} SET " . implode(',', $data) . " WHERE roll = $where";
	// echo $sql;

	$update = mysqli_query($conn, $sql);
	if (!$update || mysqli_affected_rows($conn) === 0)
		$result = "Data wan not updated !!!";
	else
		$result = "Data update successfully !!!";
}
