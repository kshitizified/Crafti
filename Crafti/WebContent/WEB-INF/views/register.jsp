<!DOCTYPE html>
<html lang="en">
<head>
	<title>Rajasthan IT Day</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('resources/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				<form class="login100-form validate-form flex-sb flex-w" action="register" method="post">
					<span class="login100-form-title p-b-53">
						Sign Up / Register
					</span>
					
					<center><span id='error'></span></center>

					

					<!--<a href="resources/#" class="btn-face m-b-20">
						<i class="fa fa-facebook-official"></i>
						Facebook
					</a>

					<a href="resources/#" class="btn-google m-b-20">
						<img src="images/icons/icon-google.png" alt="GOOGLE">
						Google
					</a> -->
					
					<div class="p-t-31 p-b-9">
						<span class="txt1">
							Type
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Type is required">
					 <select id="ddlView" style="width:100%" name="type">
					 <option value=""></option>
        <option value="farmer">Farmer</option>
        <option value="retailer">Retailer</option>
        <option value="investor">Investor</option>
        
    </select>
						<!--<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="width:100%">
    Dropdown button
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="width:100%">
    <a class="dropdown-item" href="resources/#">Action</a>
    <a class="dropdown-item" href="resources/#">Another action</a>
    <a class="dropdown-item" href="resources/#">Something else here</a>
  </div>
</div>-->
						<!--<input class="input100" type="text" name="contact" >-->
						<!--<span class="focus-input100"></span>-->
					</div>
					
					
					
					<div class="p-t-31 p-b-9">
						<span class="txt1">
							Name
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Name is required">
						<input class="input100" type="text" name="name" >
						<span class="focus-input100"></span>
					</div>
					
					
					
					
					<div class="p-t-31 p-b-9">
						<span class="txt1">
							Contact Number
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Contact Number is required">
						<input class="input100" type="number" name="contact" >
						<span class="focus-input100"></span>
					</div>
					
					
					
					
					
					<div class="p-t-13 p-b-9">
						<span class="txt1">
							Password
						</span>

						<a href="resources/#" class="txt2 bo1 m-l-5">
							Forgot?
						</a>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="password" name="password" id="password" >
						<span class="focus-input100"></span>
					</div>
					
					
					<div class="p-t-13 p-b-9">
						<span class="txt1">
							Confirm Password
						</span>

						
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Please retype your password">
						<input class="input100" type="password" name="confpassword" id="confpassword" >
						<span class="focus-input100"></span>
					</div>
					
					
					<center><span id='message'></span></center>
					
					<div class="container-login100-form-btn m-t-17">
						<button class="login100-form-btn" onclick="validate()">
							Sign Up / Register
						</button>
					</div>

					<div class="w-full text-center p-t-55">
						<span class="txt2">
							<b>Already a member?</b>
						</span>

						<a href="login" class="txt2 bo1">
							</b>Sign In now</b>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="resources/js/main.js"></script>

</body>

<script>
 function validate() {
        var e = document.getElementById("ddlView");
        var optionSelIndex = e.options[e.selectedIndex].value;
        var optionSelectedText = e.options[e.selectedIndex].text;
        if (optionSelIndex == 0) {
            alert("Please select a type");
        }
		
		var pass=document.getElementById("password");
		var confPass = document.getElementById("confpassword");
		
		
       
    }
	
	$('#password, #confpassword').on('keyup', function () {
  if ($('#password').val() == $('#confpassword').val()) {
    $('#message').html('Password Matching').css('color', 'green');
  } else 
    $('#message').html('Password Not Matching').css('color', 'red');
});
</script>
</html>