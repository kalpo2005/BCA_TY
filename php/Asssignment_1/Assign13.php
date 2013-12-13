<?php
$msg = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    $msg = ($num % 2 == 0) ? "$num is Even" : "$num is Odd";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Even or Odd</title>
    <link rel="stylesheet" href="../css/style.css">
</head>

<body>
    <div class="container">
        <h2>Even or Odd Checker</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter a Number">
            <button type="submit">Check</button>
        </form>
        <div class="result"><?= $msg ?></div>
    </div>
</body>

</html>