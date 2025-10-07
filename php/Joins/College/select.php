<?php
require_once "../../Database/database.php";

function optinMaping($tableName,$where) {
	$conn = getDatabase();

	$sql = "select * FROM {$tableName} WHERE {$where}";
	
$kal = mysqli_query($conn, $sql);
$row = mysqli_affected_rows($conn);
$rowData = '';

if ($row === 0) {
    $result = "No role found";
} else {
    while ($data = mysqli_fetch_assoc($kal)) {
        $result .= " <option value='{$data['rollId']}'>{$data['rollName']}</option> ";
    }
	return $result;
}
