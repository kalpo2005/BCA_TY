<?php
$status = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    if ($num > 0) {
        $status = "$num is Positive";
    } elseif ($num < 0) {
        $status = "$num is Negative";
    } else {
        $status = "Number is Zero";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Positive or Negative</title>
    <link rel="stylesheet" href="../css/style.css">
</head>

<body>
    <div class="container">
        <h2>Check Positive or Negative</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter a Number">
            <button type="submit">Check</button>
        </form>
        <div class="result"><?= $status ?></div>
    </div>
</body>

</html>