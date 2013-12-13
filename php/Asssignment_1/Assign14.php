<?php
$rangeOutput = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $n = $_POST["n"];
    $rangeOutput = "Numbers: ";
    for ($i = 1; $i <= $n; $i++) {
        $rangeOutput .= $i . " ";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Print 1 to N</title>
    <link rel="stylesheet" href="../css/style.css">
</head>

<body>
    <div class="container">
        <h2>Print Numbers from 1 to N</h2>
        <form method="post">
            <input type="number" name="n" min="1" required placeholder="Enter N">
            <button type="submit">Print</button>
        </form>
        <div class="result"><?= $rangeOutput ?></div>
    </div>
</body>

</html>