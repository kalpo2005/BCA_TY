<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $input = $_POST["input"];

    if (is_numeric($input)) {
        // Reverse Number
        $num = intval($input);
        $revNum = 0;
        while ($num > 0) {
            $revNum = ($revNum * 10) + ($num % 10);
            $num = intval($num / 10);
        }
        $result = "Reversed Number: $revNum";
    } else {
        // Reverse String without strrev()
        $len = strlen($input);
        $revStr = '';
        for ($i = $len - 1; $i >= 0; $i--) {
            $revStr .= $input[$i];
        }
        $result = "Reversed String: $revStr";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Reverse Number or String</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Reverse a Number or a String</h2>
        <form method="post">
            <input type="text" name="input" required placeholder="Enter number or string">
            <button type="submit">Reverse</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>