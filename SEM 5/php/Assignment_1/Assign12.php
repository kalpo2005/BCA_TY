<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $start = $_POST["start"];
    $end = $_POST["end"];
    $result = "Armstrong numbers between $start and $end:<br>";
    for ($i = $start; $i <= $end; $i++) {
        $sum = 0;
        $temp = $i;
        $digits = strlen($i);
        while ($temp > 0) {
            $rem = $temp % 10;
            $sum += pow($rem, $digits);
            $temp = intval($temp / 10);
        }
        if ($sum == $i) {
            $result .= $i . ", ";
        }
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Dynamic Armstrong</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Find Armstrong Numbers in Range</h2>
        <form method="post">
            <input type="number" name="start" required placeholder="Start number">
            <input type="number" name="end" required placeholder="End number">
            <button type="submit">Check</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>