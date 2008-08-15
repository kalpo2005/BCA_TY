<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $start = $_POST["start"];
    $end = $_POST["end"];
    $result = "Prime numbers between $start and $end:<br>";
    for ($i = $start; $i <= $end; $i++) {
        if ($i < 2) continue;
        $isPrime = true;
        for ($j = 2; $j <= sqrt($i); $j++) {
            if ($i % $j == 0) {
                $isPrime = false;
                break;
            }
        }
        if ($isPrime) {
            $result .= $i . ", ";
        }
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Dynamic Prime</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Find Prime Numbers in Range</h2>
        <form method="post">
            <input type="number" name="start" required placeholder="Start number">
            <input type="number" name="end" required placeholder="End number">
            <button type="submit">Check</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>