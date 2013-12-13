<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $value = $_POST["value"];
    $conversion = $_POST["conversion"];
    if ($conversion == "mtokm") {
        $result = "$value meters = " . ($value / 1000) . " kilometers";
    } else {
        $result = "$value kilometers = " . ($value * 1000) . " meters";
    }
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Meter ↔ Kilometer</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Meter ↔ Kilometer Converter</h2>
        <form method="post">
            <input type="number" name="value" required placeholder="Enter value">
            <select name="conversion">
                <option value="mtokm">Meter to Kilometer</option>
                <option value="kmtom">Kilometer to Meter</option>
            </select>
            <button type="submit">Convert</button>
        </form>
        <div class="result"><?= $result ?></div>
    </div>
</body>

</html>