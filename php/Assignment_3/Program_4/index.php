<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "book";
$result = "";
$addBook = false;
$update = false;
$search = '';
$limit = null;


if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    if (isset($_POST['addnew'])) {
        $addBook = true;
    } else  if (isset($_POST['update']) && $_POST['update'] === 'update') {
        $kal = mysqli_query($conn, $sql);
        $data = mysqli_fetch_assoc($kal);
        $update = true;
    } else if (isset($_POST['deleteBtn']) && $_POST['deleteBtn'] === 'delete') {
        $keys = "book_id=" . $_POST['book_id'];
        header("Location:delete.php?" . $keys);
    } else if (isset($_POST['searchbtn']) && $_POST['searchbtn'] === 'searchbtn') {
        if (isset($_POST['search'])) {
            $search = trim($_POST['search']);
        }
        if (isset($_POST['column'])) {
            if ($_POST['column'] !== 'all')
                $limit = trim($_POST['column']);
        }
    }
}

$sql = "SELECT * FROM {$tableName}";
if (!bookty($search)) {
    $sql .= " WHERE name LIKE '%{$search}%' ";
    $sql .= " OR gender LIKE '%{$search}%' ";
    $sql .= " OR department LIKE '%{$search}%' ";
    $sql .= " OR book_type LIKE '%{$search}%' ";
}

if (!bookty($limit)) {
    $sql .= "  LIMIT {$limit}";
}

$kal = mysqli_query($conn, $sql);
$row = mysqli_affected_rows($conn);
$rowData = '';

if ($row === 0) {
    $result = "No user found";
} else {
    while ($data = mysqli_fetch_assoc($kal)) {
        $result .= "<tr>
                    <td>{$data['bookId']}</td>
                    <td>{$data['bookName']}</td>
                    <td>{$data['AuthorName']}</td>
                    <td>{$data['price']}</td>
                    <td>{$data['netAmmount']}</td>
					<td> " .
            '<form method="POST" class="btns">
                         <input type="hidden" name="bookId" value="' . $data["bookId"] . '">
						<button type="submit" name="update" value="update" class="updatebtn">Account</button>
						<button type="submit" name="deleteBtn" value="delete" class="deletebtn">Delete</button>
					</form>
                    </td>
                </tr>';
    }
}

?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Management</title>
    <link rel="stylesheet" href="..\css\main.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f9f9f9;
        }
    </style>
</head>

<body>

    <div class="book">

        <div class="addbook">
            <form action="" method="POST">
                <input type="hidden" name="addnew" value="addUser">
                <button type="submit" name="adduser" class="searchbtn updatebtn">Add New</button>
            </form>
        </div>
        <div class="search">
            <div>
                <form action="" method="POST">
                    <span><strong>show Entries</strong></span>
                    <select name="column">
                        <option value="all" selected>All</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                    </select>
            </div>
            <div>

                <input type="text" name="search" value="<?php if (!bookty($search)) echo $search ?>" placeholder="Search by Name.....">
                <button type="submit" name="searchbtn" value="searchbtn" class="searchbtn updatebtn">Search</button>
                </form>
            </div>
        </div>
        <table class="bookloyee-table">
            <thead>
                <tr>
                    <th>Book Id</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Price</th>
                    <th>Quality</th>
                    <th>Net Ammount</th>
                </tr>
            </thead>
            <tbody>
                <!-- <tr>
                    <td>kalpesh</td>
                    <td>male</td>
                    <td>Casual</td>
                    <td>Admin</td>
                    <td>
					<form method="POST" class="btns">
                         <input type="hidden" name="book_id" value="1">
						<button type="submit" name="account" value="account" class="updatebtn">Account</button>
						<button type="submit" name="deleteBtn" value="delete" class="deletebtn">Delete</button>
					</form>
                    </td>
                </tr>-->

                <?php echo $result; ?>
            </tbody>
        </table>


    </div>
    <?php if ($addBook): ?>
        <div class="AddForm">
            <div>

                <?php if ($update): ?>
                    <form method="POST" action="insert.php">
                    <?php else: ?>
                        <form method="POST" action="insert.php">
                        <?php endif; ?>
                        <div>
                            <p>Enter book Id</p>
                            <input type="number" name="bookId" value="<?php if (isset($data['bookId'])) echo $data['bookId']; ?>" placeholder="Enter book Id" required>
                        </div>

                        <div>
                            <p>Enter book name</p>
                            <input type="text" name="bookName" value="<?php if (isset($data['bookName'])) echo $data['bookName']; ?>" placeholder="Enter book name" required>
                        </div>

                        <div>
                            <p>Enter author name</p>
                            <input type="text" name="AuthorName" value="<?php if (isset($data['AuthorName'])) echo $data['AuthorName']; ?>" placeholder="Enter author name" required>
                        </div>

                        <div>
                            <p>Enter book Price</p>
                            <input type="text" name="price" value="<?php if (isset($data['price'])) echo $data['price']; ?>" placeholder="Enter book price" required>
                        </div>

                        <div>
                            <p>Enter book quantity</p>
                            <input type="text" name="quantity" value="<?php if (isset($data['quantity'])) echo $data['quantity']; ?>" placeholder="Enter book quantity" required>
                        </div>

                        <div>
                            <p>Enter book name</p>
                            <input type="text" name="bookName" value="<?php if (isset($data['bookName'])) echo $data['bookName']; ?>" placeholder="Enter book name" required>
                        </div>

                        <?php if ($update): ?>
                            <button type="submit" name="update" id="btn">Submit</button>
                        <?php else: ?>
                            <button type="submit" name="addbook" id="btn">Submit</button>
                        <?php endif; ?>
            </div>
            </form>
        </div>
        </div>

    <?php endif; ?>

</body>


<!-- CREATE TABLE book(
    bookId INT(5) PRIMARY KEY,
    bookName VARCHAR(255),
    AuthorName VARCHAR(255),
    price INT(15),
    quantity INT(5),
	netAmmount INT(20)
); -->

</html>