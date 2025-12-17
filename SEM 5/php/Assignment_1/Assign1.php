<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $year = $_POST["year"];
    if (($year % 4 == 0 && $year % 100 != 0) || ($year % 400 == 0)) {
        $result = "$year is a Leap Year.";
    } else {
        $result = "$year is not a Leap Year.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Assignment 1 - Leap Year</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 1: Check Leap Year</h2>
        <form method="post">
            <input type="number" name="year" required placeholder="Enter a year">
            <button type="submit">Check</button>
        </form>
    </div>

    <div class="result">
        <?php echo $result; ?>
    </div>
</body>

</html>