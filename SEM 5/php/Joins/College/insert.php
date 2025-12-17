<?php

require_once "../../Database/database.php";

function insertData($tableName, $data)
{
    $conn = getDatabase();

    $keys = array_keys($data);

    $sql = "INSERT INTO {$tableName} (" . implode(',', $keys) . ") VALUES (" . implode(',', $data) . ")";

    try {
        if (!mysqli_query($conn, $sql))
            return false;
        else
            return true;
    } catch (Exception $e) {
        echo $e->getMessage();
    }
}
