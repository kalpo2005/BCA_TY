<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];

    if (is_numeric($num) && $num >= 10 && $num <= 99) {
        $firstDigit = intval($num / 10);
        $secondDigit = $num % 10;
        $result = "The digits are: $firstDigit and $secondDigit";
    } else {
        $result = "Please enter a valid 2-digit number (10 to 99).";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Separate 2-Digit Number</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Separate Digits of a 2-Digit Number</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter 2-digit number" min="10" max="99">
            <button type="submit">Separate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>