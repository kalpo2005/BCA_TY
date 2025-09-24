<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST["a"];
    $b = $_POST["b"];
    if (is_numeric($a) && is_numeric($b)) {
        $result = "Addition: " . ($a + $b) . "<br>" .
            "Subtraction: " . ($a - $b) . "<br>" .
            "Multiplication: " . ($a * $b) . "<br>" .
            "Division: " . ($b != 0 ? ($a / $b) : "Cannot divide by zero");
    } else {
        $result = "Please enter valid numbers.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Assignment 2 - Arithmetic</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 2: Arithmetic Operations</h2>
        <form method="post">
            <input type="number" name="a" required placeholder="Enter first number">
            <input type="number" name="b" required placeholder="Enter second number">
            <button type="submit">Calculate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>