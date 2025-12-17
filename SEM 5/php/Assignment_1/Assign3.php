<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $total = 0;
    for ($i = 1; $i <= 5; $i++) {
        $total += $_POST["m$i"];
    }
    $percentage = $total / 5;
    if ($percentage >= 90) $grade = "A";
    elseif ($percentage >= 75) $grade = "B";
    elseif ($percentage >= 60) $grade = "C";
    elseif ($percentage >= 40) $grade = "D";
    else $grade = "Fail";

    $result = "Total Marks: $total<br>Percentage: $percentage%<br>Grade: $grade";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Assignment 3 - Marks & Grade</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Assignment 3: Total, Percentage & Grade</h2>
        <form method="post">
            <?php
            for ($i = 1; $i <= 5; $i++) {
                echo '<input type="number" name="m' . $i . '" required placeholder="Marks for Subject ' . $i . '">';
            }
            ?>
            <button type="submit">Calculate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>