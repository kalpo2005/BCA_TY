<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["marks"])) {
    $marks = $_POST["marks"];
    $total = array_sum($marks);
    $percentage = $total / count($marks);
    if ($percentage >= 90) $grade = "A";
    elseif ($percentage >= 75) $grade = "B";
    elseif ($percentage >= 60) $grade = "C";
    elseif ($percentage >= 40) $grade = "D";
    else $grade = "F";

    $result = "<p>Total Marks: $total</p>";
    $result .= "<p>Percentage: " . round($percentage, 2) . "%</p>";
    $result .= "<p>Grade: $grade</p>";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Marks & Grade</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Subject Marks, Percentage & Grade</h2>
        <form method="post">
            <?php for ($i = 1; $i <= 5; $i++): ?>
                <label>Subject <?= $i ?> Marks:</label>
                <input type="number" name="marks[]" required>
            <?php endfor; ?>
            <button type="submit">Calculate</button>
        </form>
        <div class="result"><?php if(isset($result)) echo $result; ?></div>
    </div>
</body>

</html>