<?php
$result = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $book = $_POST["book"];
    $qty = $_POST["qty"];
    $price = $_POST["price"];

    $total = $qty * $price;
    $result = "Book: $book<br>Quantity: $qty<br>Unit Price: ₹$price<br><strong>Total Price: ₹$total</strong>";
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Book Stall Management</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <h2>Book Stall Management</h2>
        <form method="post">
            <input type="text" name="book" required placeholder="Book Name">
            <input type="number" name="qty" required placeholder="Quantity">
            <input type="number" name="price" required placeholder="Price per Book">
            <button type="submit">Calculate</button>
        </form>
    </div>
    <div class="result"><?php echo $result; ?></div>
</body>

</html>