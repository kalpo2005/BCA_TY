<?php

$isError = false;
$isUploaded = false;
$error = array();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

	try {

		//$file = $_FILES['image'] ?? null;
		$file = isset($_FILES['image']) ? $_FILES['image'] : null;
		//	print_r($file);
		$tmpName = $file['tmp_name'];
		$fileName = $file['name'];
		$allowedExtention = array('png', 'jpg', 'jpeg');
		$extention = strtolower(pathinfo($fileName, PATHINFO_EXTENSION));
		$filePath ="../uploads/";
		//echo $filePath;

		if ($file['error'] != UPLOAD_ERR_OK) {
			$isError = true;
			$error['image'] = "Image Not uploaded !!!";
			throw new Exception("Image not Uploaded !!!");
		}

		if ($file['size'] > 1 * 1024 * 1024) {
			$isError = true;
			$error['image'] = "Image size must be less 1 MB !!!";
			throw new Exception("Image size must be less 1 MB !!!");
		}

		if (!in_array($extention, $allowedExtention)) {
			$isError = true;
			$error['image'] = "Allowed extentions are " . implode(',', $allowedExtention) . "  !!!!";
			throw new Exception(" This extention are not allowed !!!");
		}
		if (!is_dir($filePath)) {
			mkdir($filePath, 0775, true);
		}
		if(!$isError)
			$isUploaded = true;

		$dateName = date('ymd_hmi');
		$fullPath = $filePath . $dateName . "." . $extention;

		if (!move_uploaded_file($tmpName, $fullPath)) {
			$error['image'] = "File can't uploaded !!!";
			throw new Exception("File can't uploaded !!!");
		} 
		//echo $fullPath . " 555";
	} catch (Exception $e) {
		echo " <script> alert({$e->getMessage()}); </script>";
	}
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Upload File</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>

	<div class="container">
		<h2>Upload File</h2>

		<form method="POST" id="form" action="" enctype="multipart/form-data">

			<div class="field">
				<p>Upload your file</p>
				<input type="file" name="image">
				<?php if (!empty($error['image']) && $isError) {
					echo "<p class='errorMessage'>" . $error['image'] . "</p>";
				} ?>
			</div>


			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	<?php if ($isUploaded): ?>
	<div>
		<h2>your file is </h2>
			<img class="fileupload" src="<?php echo $fullPath; ?>" />
			</div>
	<?php endif; ?>
		</div>
		
</body>

</html>