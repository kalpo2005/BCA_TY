<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $start = $_POST["start"];
    $end = $_POST["end"];
    $result = "Palindrome numbers between $start and $end:<br>";
    for ($i = $start; $i <= $end; $i++) {
        $rev = 0;
        $temp = $i;
        while ($temp > 0) {
            $rev = ($rev * 10) + ($temp % 10);
            $temp = intval($temp / 10);
        }
        if ($i == $rev) {
            $result .= $i . "<br> ";
        }
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Dynamic Palindrome</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Find Palindromes in Range</h2>
        <form method="post">
            <input type="number" name="start" required placeholder="Start number">
            <input type="number" name="end" required placeholder="End number">
            <button type="submit">Check</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>