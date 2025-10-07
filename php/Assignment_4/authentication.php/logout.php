<?php

session_start();

	if ($_SERVER['REQUEST_METHOD'] === 'POST') {
		if(isset($_SESSION['isLogin']) && $_SESSION['isLogin'] === true){
		session_destroy();
		echo "<script>
		alert('user logout successfully !!!);
		</script>";
		header("Location:index.php");
	}
}
?>
