<?php
$message = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST['num'];
    $sqrt = sqrt($num);
    $message = ($sqrt == floor($sqrt)) ? "$num is a Perfect Square" : "$num is NOT a Perfect Square";
}
?>
<!DOCTYPE html>
<html>
<head>
    <title>Perfect Square</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>Check Perfect Square</h2>
    <form method="post">
        <input type="number" name="num" required placeholder="Enter a Number">
        <button type="submit">Check</button>
    </form>
    <div class="result"><?= $message ?></div>
</div>
</body>
</html>
