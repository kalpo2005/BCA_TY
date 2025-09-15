<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "book";
$result = "";
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $data = array();

    $data['netAmmount'] =  $_POST['price'] *  $_POST['quantity'];
    foreach ($_POST as $key => $value) {
        if (!empty($value))
            $data[$key] = "'" . $value . "'";
    }

    $keys = array_keys($data);

    $sql = "INSERT INTO {$tableName} (" . implode(',', $keys) . ") VALUES (" . implode(',', $data) . ")";

    try {
        if (!mysqli_query($conn, $sql))
            die("Query Failed !!!");
        else
            echo "<script>
        alert('Data inserted successfully !!!');
        window.location.href = 'index.php';
    </script>";
    } catch (Exception $e) {
        echo $e->getMessage();
    }
}
