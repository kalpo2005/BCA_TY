<?php

require_once "../../Database/database.php";

function updateData($tableName, $data,$where)
{
    $conn = getDatabase();

    $sql = "UPDATE {$tableName} SET ".implode(",",$data) . " WHERE {$where} ";
echo $sql;
    try {
        if (!mysqli_query($conn, $sql))
            return false;
        else
            return true;
    } catch (Exception $e) {
        echo $e->getMessage();
    }
}
