<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $p = $_POST["principal"];
    $r = $_POST["rate"];
    $n = $_POST["time"];

    $si = ($p * $r * $n) / 100;
    $result = "Simple Interest: ₹" . $si;
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
            <input type="number" name="principal" required placeholder="Principal (P)">
            <input type="number" name="rate" required placeholder="Rate of Interest (R)">
            <input type="number" name="time" required placeholder="Time (N)">
            <button type="submit">Calculate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>