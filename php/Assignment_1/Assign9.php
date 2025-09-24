<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    if (is_numeric($num) && $num >= 0) {
        $num = intval($num);

        // Check Palindrome
        $rev = 0;
        $temp = $num;
        while ($temp > 0) {
            $rev = ($rev * 10) + ($temp % 10);
            $temp = intval($temp / 10);
        }
        $isPalindrome = ($num == $rev);

        // Check Armstrong
        $sum = 0;
        $temp = $num;
        $digits = strlen($num);
        while ($temp > 0) {
            $rem = $temp % 10;
            $sum += pow($rem, $digits);
            $temp = intval($temp / 10);
        }
        $isArmstrong = ($sum == $num);

        // Check Prime
        $isPrime = true;
        if ($num <= 1) {
            $isPrime = false;
        } else {
            for ($i = 2; $i <= sqrt($num); $i++) {
                if ($num % $i == 0) {
                    $isPrime = false;
                    break;
                }
            }
        }

        // Output
        $result = "Number: $num<br>";
        $result .= "Palindrome: " . ($isPalindrome ? "Yes" : "No") . "<br>";
        $result .= "Armstrong: " . ($isArmstrong ? "Yes" : "No") . "<br>";
        $result .= "Prime: " . ($isPrime ? "Yes" : "No");
    } else {
        $result = "Please enter a valid positive number.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Check Number Properties</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Check if Number is Palindrome, Armstrong, Prime</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter a number">
            <button type="submit">Check</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>