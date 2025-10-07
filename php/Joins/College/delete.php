<?php
require_once "../../Database/database.php";

function deleteData($tableName, $where)
{
	$conn = getDatabase();

	$sql = "DELETE FROM {$tableName} WHERE {$where}";

	try {
		$kal = mysqli_query($conn, $sql);

		if (mysqli_affected_rows($conn) !== 0) {
			return true;
		} else {
			return false;
		}
	} catch (Exception $e) {
		die($e->getMessage());
	}
}
