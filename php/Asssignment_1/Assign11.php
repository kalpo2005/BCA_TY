<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    $fact = 1;
    for ($i = 1; $i <= $num; $i++) {
        $fact *= $i;
    }
    $result = "Factorial of $num is $fact";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Factorial</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Factorial Calculator</h2>
        <form method="post">
            <input type="number" name="num" min="0" required placeholder="Enter a Number">
            <button type="submit">Calculate</button>
        </form>
        <div class="result"><?= $result ?></div>
    </div>
</body>

</html>