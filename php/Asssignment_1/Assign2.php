<?php
$output = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST["num1"];
    $b = $_POST["num2"];
    $output .= "<p>Addition: " . ($a + $b) . "</p>";
    $output .= "<p>Subtraction: " . ($a - $b) . "</p>";
    $output .= "<p>Multiplication: " . ($a * $b) . "</p>";
    $output .= ($b != 0) ? "<p>Division: " . ($a / $b) . "</p>" : "<p>Division: Cannot divide by zero</p>";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Calculator</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Basic Calculator</h2>
        <form method="post">
            <label>First Number:</label>
            <input type="number" name="num1" required>
            <label>Second Number:</label>
            <input type="number" name="num2" required>
            <button type="submit">Calculate</button>
        </form>
        <div class="result"><?= $output ?></div>
    </div>
</body>

</html>