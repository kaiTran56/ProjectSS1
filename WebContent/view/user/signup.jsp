<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	contenteditable="width=device-width, initial-scale-1.0">
<title>SignUp</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background: #C8E2B1;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Montserrat', sans-serif;
	height: 100vh;
	margin: -20px 0 50px;
}

h1 {
	font-weight: bold;
	margin: 0;
	margin-bottom: 10px;
	color: #006600;
}

h2 {
	font-weight: bold;
	margin: 0;
	margin-bottom: 10px;
	color: white;
}

p {
	font-size: 12px;
	font-weight: 100;
	line-height: 20px;
	letter-spacing: 0.5px;
	margin: 20px 0 50px;
}

span {
	font-size: 10.5px;
	margin-bottom: 15px;
	margin-top: 5px;
	color: #006600;
}

a {
	color: #006600;
	font-size: 12px;
	text-decoration: none;
	margin: 15px 0;
	text-decoration: underline;
	margin-top: 20px;
}

button {
	border-radius: 20px;
	border: 1px solid #367517;
	background-color: #367517;
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
	margin-top: 20px;
}

button:active {
	transform: scale(0.95);
}

button:focus {
	outline: none;
}

button.ghost {
	background-color: transparent;
	border-color: #FFFFFF;
}

form {
	background-color: #FFFFFF;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 50px;
	height: 100%;
	text-align: center;
}

input {
	background-color: #eee;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 100%;
}

.container {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px
		rgba(0, 0, 0, 0.22);
	position: relative;
	overflow: hidden;
	width: 768px;
	max-width: 100%;
	min-height: 480px;
}

.form-container {
	position: absolute;
	top: 0;
	height: 100%;
	transition: all 0.6s ease-in-out;
}

.sign-up-container-firstpage {
	left: 0;
	width: 50%;
	z-index: 2;
}

.container.right-panel-active .sign-up-container-firstpage {
	transform: translateX(100%);
}

.sign-up-container {
	left: 0;
	width: 50%;
	opacity: 0;
	z-index: 1;
}

.container.right-panel-active .sign-up-container {
	transform: translateX(100%);
	opacity: 1;
	z-index: 5;
	animation: show 0.6s;
}

@
keyframes show { 0%, 49.99% {
	opacity: 0;
	z-index: 1;
}

50




















%
,
100




















%
{
opacity




















:




















1


















;
z-index




















:




















5


















;
}
}
.overlay-container {
	position: absolute;
	top: 0;
	left: 50%;
	width: 50%;
	height: 100%;
	overflow: hidden;
	transition: transform 0.6s ease-in-out;
	z-index: 100;
}

.container.right-panel-active .overlay-container {
	transform: translateX(-100%);
}

.overlay {
	background: -webkit-linear-gradient(to right, #489620, #008C5E);
	background: linear-gradient(to right, #008C5E, #489620);
	background-repeat: no-repeat;
	background-size: cover;
	background-position: 0 0;
	color: #FFFFFF;
	position: relative;
	left: -100%;
	height: 100%;
	width: 200%;
	transform: translateX(0);
	transition: transform 0.6s ease-in-out;
}

.container.right-panel-active .overlay {
	transform: translateX(50%);
}

.overlay-panel {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 40px;
	text-align: center;
	top: 0;
	height: 100%;
	width: 50%;
	transform: translateX(0);
	transition: transform 0.6s ease-in-out;
}

.overlay-left {
	transform: translateX(-20%);
}

.container.right-panel-active .overlay-left {
	transform: translateX(0);
}

.overlay-right {
	right: 0;
	transform: translateX(0);
}

.container.right-panel-active .overlay-right {
	transform: translateX(20%);
}

footer {
	background-color: #222;
	color: #fff;
	font-size: 14px;
	bottom: 0;
	position: fixed;
	left: 0;
	right: 0;
	text-align: center;
	z-index: 999;
}

footer p {
	margin: 10px 0;
}

footer i {
	color: green;
}

footer a {
	color: green;
	text-decoration: none;
}
</style>
</head>
<body>
	
	<div class="container" id="container">
		<div class="form-container sign-up-container">
			<form action="${pageContext.request.contextPath}/view/register"
				method="post">
				<h1>Sign Up</h1>
				<input type="text" placeholder="Username" name="fullName" /> <input
					type="text" placeholder="Date of Birth (DOB)" name="DOB" /> <input
					type="text" placeholder="Address" name="address" /> <input
					type="number" placeholder="Phone number" name="phoneNumber" /> <input
					type="text" placeholder="Example@gmail.com" name="email" /> <input
					type="password" placeholder="Password" name="password" /> <input
					type="password" placeholder="Confirm Password" name="repassword" />

				<button>Sign Up</button>
			</form>
		</div>
		<div class="form-container sign-up-container-firstpage">
			<form action="${pageContext.request.contextPath}/view/user/login" method="post">
				<h3 style="colẻ: red; font-weight: bold">${requestScope.errorPassword }</h3>
				<h3 style="color: red; font-weight: bold">${requestScope.notSuccess}
				</h3>
				<h3 style="color: blue; font-weight: bold">${requestScope.success}
				</h3>
				<h1>Sign In</h1>
				<span>Sign in with email and phone number</span> <input type="text"
					placeholder="Email" name="name" /> <input type="password"
					placeholder="Password" name="pass" />
				<div>
					<span style="color: Red; front-weight: bold">${requestScope.error}</span>
				</div>
				<button>Sign in</button>

			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-left">
					<h2>Welcome ...</h2>
					<p>to The World of Knowledge</p>
					<button class="ghost" id="comeBack">Come back</button>
				</div>
				<div class="overlay-panel overlay-right">
					<h2>Hello!</h2>
					<p>My name is "ONLINE LIBRARY". If you dont't have account,
						please enter your personal details to start journey with me.</p>
					<button class="ghost" id="signUp">Sign Up</button>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" async=""
		src="https://www.google-analytics.com/analytics.js"></script>
	<script
		src="https://partner.googleadservices.com/gampad/cookie.js?domain=anonystick.com&amp;callback=_gfp_s_&amp;client=ca-pub-1121308659421064&amp;cookie=ID%3D30ef4963e726bc22%3AT%3D1601867713%3AS%3DALNI_MYKre9fOXFq7S33O70k_HC_rwqx-Q"></script>
	<script
		src="https://pagead2.googlesyndication.com/pagead/js/r20201001/r20190131/show_ads_impl_fy2019.js"
		id="google_shimpl"></script>
	<script>
                const signUpButton = document.getElementById('signUp');
                const container = document.getElementById('container');
                const comeBackButton = document.getElementById('comeBack');
                signUpButton.addEventListener('click', () => {
                    container.classList.add('right-panel-active');
                });
                comeBackButton.addEventListener('click', () => {
                    container.classList.remove('right-panel-active');
                });
            </script>
	</div>
	</div>
</body>
</html>