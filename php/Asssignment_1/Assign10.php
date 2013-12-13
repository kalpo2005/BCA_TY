<?php
$reversed = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $val = $_POST["value"];
    $reversed = "Reversed: " . strrev($val);
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Reverse Input</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Reverse Number or String</h2>
        <form method="post">
            <input type="text" name="value" required placeholder="Enter Number or String">
            <button type="submit">Reverse</button>
        </form>
        <div class="result"><?= $reversed ?></div>
    </div>
</body>

</html>