<?php
$result = "";
function isPalindrome($n)
{
    return $n == strrev($n);
}
function isArmstrong($n)
{
    $sum = 0;
    $temp = $n;
    while ($temp > 0) {
        $digit = $temp % 10;
        $sum += $digit ** 3;
        $temp = floor($temp / 10);
    }
    return $n == $sum;
}
function isPrime($n)
{
    if ($n < 2) return false;
    for ($i = 2; $i <= sqrt($n); $i++) {
        if ($n % $i == 0) return false;
    }
    return true;
}
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    $result .= "<p>Palindrome: " . (isPalindrome($num) ? "Yes" : "No") . "</p>";
    $result .= "<p>Armstrong: " . (isArmstrong($num) ? "Yes" : "No") . "</p>";
    $result .= "<p>Prime: " . (isPrime($num) ? "Yes" : "No") . "</p>";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Number Checker</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Check Number: Palindrome, Armstrong, Prime</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter a Number">
            <button type="submit">Check</button>
        </form>
        <div class="result"><?= $result ?></div>
    </div>
</body>

</html>