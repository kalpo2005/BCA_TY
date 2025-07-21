<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST["a"];
    $b = $_POST["b"];
    $c = $_POST["c"];
    if ($a >= $b && $a >= $c) {
        $greatest = $a;
    } elseif ($b >= $a && $b >= $c) {
        $greatest = $b;
    } else {
        $greatest = $c;
    }
    $result = "The greatest number is: $greatest";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Assignment 4 - Greatest Number</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 4: Greatest of Three Numbers</h2>
        <form method="post">
            <input type="number" name="a" required placeholder="Enter first number">
            <input type="number" name="b" required placeholder="Enter second number">
            <input type="number" name="c" required placeholder="Enter third number">
            <button type="submit">Find Greatest</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>