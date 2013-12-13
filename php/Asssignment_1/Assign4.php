<?php
$output = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST['a'];
    $b = $_POST['b'];
    $c = $_POST['c'];
    $max = max($a, $b, $c);
    $output = "Greatest Number is: $max";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Greatest of Three</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Find Greatest of Three Numbers</h2>
        <form method="post">
            <input type="number" name="a" required placeholder="First Number">
            <input type="number" name="b" required placeholder="Second Number">
            <input type="number" name="c" required placeholder="Third Number">
            <button type="submit">Find Greatest</button>
        </form>
        <div class="result"><?= $output ?></div>
    </div>
</body>

</html>