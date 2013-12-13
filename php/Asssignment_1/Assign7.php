<?php
$output = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST["a"];
    $b = $_POST["b"];
    $original = "Before Swap: A = $a, B = $b<br>";
    $a = $a + $b;
    $b = $a - $b;
    $a = $a - $b;
    $output = $original . "After Swap: A = $a, B = $b";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Swap Two Numbers</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Swap Numbers (No Temp Variable)</h2>
        <form method="post">
            <input type="number" name="a" required placeholder="Enter A">
            <input type="number" name="b" required placeholder="Enter B">
            <button type="submit">Swap</button>
        </form>
        <div class="result"><?= $output ?></div>
    </div>
</body>

</html>