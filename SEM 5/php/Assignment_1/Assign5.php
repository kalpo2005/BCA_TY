<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST["num"];
    $sqrt = sqrt($num);
    if ($sqrt == floor($sqrt)) {
        $result = "$num is a perfect square.";
    } else {
        $result = "$num is not a perfect square.";
    }
}
?>
<html>
<html>

<head>
    <title>Assignment 5 - Perfect Square</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 5: Check Perfect Square</h2>
        <form method="post">
            <input type="number" name="num" required placeholder="Enter a number">
            <button type="submit">Check</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>