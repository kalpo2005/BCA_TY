<?php
$output = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $n = $_POST["n"];
    $a = 0;
    $b = 1;
    $series = "$a, $b";
    for ($i = 2; $i < $n; $i++) {
        $c = $a + $b;
        $series .= ", $c";
        $a = $b;
        $b = $c;
    }
    $output = "Fibonacci Series: $series";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Fibonacci Series</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Fibonacci Series Generator</h2>
        <form method="post">
            <input type="number" name="n" min="1" required placeholder="Enter number of terms">
            <button type="submit">Generate</button>
        </form>
        <div class="result"><?= $output ?></div>
    </div>
</body>

</html>