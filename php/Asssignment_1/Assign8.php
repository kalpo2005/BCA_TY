<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    if ($num >= 10 && $num <= 99) {
        $tens = floor($num / 10);
        $units = $num % 10;
        $result = "Tens: $tens<br>Units: $units";
    } else {
        $result = "Please enter a valid two-digit number.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Separate Digits</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Separate Digits of 2-Digit Number</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter 2-digit number">
            <button type="submit">Separate</button>
        </form>
        <div class="result"><?= $result ?></div>
    </div>
</body>

</html>