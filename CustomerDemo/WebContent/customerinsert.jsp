<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Logging</title>
    <link rel="stylesheet" type="text/css" href="headerfooter.css">
</head>
<body>
<!--header-->
 
<div class="header">
	<a href="index.html">
	<img class="logo"  src="images/carelogo.png" alt="Serendib Hospitals" height="80"  width ="80">
	</a>
	<div class="navigation">
		<a href="#contact">ACCOUNT</a>
		<a href="#about">ABOUT US</a>
		<a href="#about">CONTACT US</a>
		<a href="#about">LOGIN</a>
		<a href="#about">REGISTER</a>
		<a href="index.html">HOME</a>
	</div>
	
	<h2 class="title"><a href='index.html'>CARE <br>&nbsp HOSPITALS </h2> </a>
	
</div>
<!-- footer -->

<div class="footer">
	<div class= "follow">Follow us on </div>
	<div class="getthe">Get the app </div>
	<div class="copy">Copyright &copy; Care Hospitals PLC <br> 253f, <br>Udaya Mawatha,<br> Malabe. </div>

	<div class="socialbuttons">
		<a href="https://www.facebook.com"><img src="images/fb.png" alt="facebook" class="fb"></a>
		<a href="https://www.instagram.com"><img src="images/insta.webp" alt="instagram" class="insta"></a>
		<a href="https://www.twitter.com"><img src="images/twitter.png" alt="twitter" class="twitter"></a>
		<a href="https://www.play.google.com"><img src="images/android.png" alt="play store" class="android"></a>
		<a href="https://www.apple.com/ios/app-store/"><img src="images/ios.png" alt="app store" class="ios" ></a>
	</div>
<!-- end of footer -->

</div>
</body>
</html>
		
		<h1 class="pr1">
		 Patient Registration </h1>
		<
	<form class="regform" action="in" method="post">
	<center>
		Name <input type="text" name="name"><br>
		Email <input type="text" name="email"><br>
		Phone Number <input type="text" name="phone"><br>
		Age <input type="text" name="age"><br>
		Address <input type="text" name="add"><br>
		User Name <input type="text" name="uid"><br>
		Password <input type="password" name="psw"><br>
		
		<input type="submit" name="submit" value="Create Customer">
		</center>
	</form>
	
	<style>
	.regform{
		border:2px solid black;
		border-color:solid black;
		width:300px;
		height:200px;
		font-size: 20px;
		position: absolute;
		left:350px;
		top: 150px;
	}
	
	.pr1{
	font-color:solid black;
	font-size:35px;
	position:absolute;
	top:75px;
	left:350px;
	}
	</style>
</body>
</html>