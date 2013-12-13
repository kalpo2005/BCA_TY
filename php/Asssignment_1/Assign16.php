<?php
$interest = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $p = $_POST["principal"];
    $r = $_POST["rate"];
    $t = $_POST["time"];
    $si = ($p * $r * $t) / 100;
    $interest = "Simple Interest: ₹" . round($si, 2);
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Simple Interest</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Simple Interest Calculator</h2>
        <form method="post">
            <input type="number" name="principal" required placeholder="Principal (₹)">
            <input type="number" name="rate" required placeholder="Rate (%)">
            <input type="number" name="time" required placeholder="Time (Years)">
            <button type="submit">Calculate</button>
        </form>
        <div class="result"><?= $interest ?></div>
    </div>
</body>

</html>