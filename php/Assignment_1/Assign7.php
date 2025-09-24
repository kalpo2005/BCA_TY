<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST["a"];
    $b = $_POST["b"];

    if (is_numeric($a) && is_numeric($b)) {
        // Swap without third variable using arithmetic
        $a = $a + $b;
        $b = $a - $b;
        $a = $a - $b;

        $result = "After swapping:<br>First Number: $a<br>Second Number: $b";
    } else {
        $result = "Please enter valid numeric values.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Swap Without Third Variable</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Swap Two Numbers Without Using Third Variable</h2>
        <form method="post">
            <input type="number" name="a" required placeholder="Enter first number">
            <input type="number" name="b" required placeholder="Enter second number">
            <button type="submit">Swap</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>