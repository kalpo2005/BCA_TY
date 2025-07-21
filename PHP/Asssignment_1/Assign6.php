<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $km = $_POST["km"];
    if (is_numeric($km)) {
        $meter = $km * 1000;
        $result = "$km kilometer = $meter meters.";
    } else {
        $result = "Please enter a valid distance in kilometers.";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Assignment 6 - Kilometer to Meter</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 6: Kilometer to Meter</h2>
        <form method="post">
            <input type="number" name="km" step="any" required placeholder="Enter distance in kilometer">
            <button type="submit">Convert</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>