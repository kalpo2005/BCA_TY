<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $basic = $_POST["basic"];

    $da = $basic * 0.05;
    $pf = $basic * 0.05;
    $tax = $basic * 0.05;
    $ta = $basic * 0.10;

    $gross = $basic + $da + $ta - $pf - $tax;

    $result = "Basic Salary: ₹$basic<br>";
    $result .= "DA (5%): ₹$da<br>TA (10%): ₹$ta<br>PF (5%): ₹$pf<br>Tax (5%): ₹$tax<br>";
    $result .= "<strong>Gross Salary: ₹$gross</strong>";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Gross Salary Calculator</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Gross Salary Calculator</h2>
        <form method="post">
            <input type="number" name="basic" required placeholder="Basic Salary">
            <button type="submit">Calculate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>