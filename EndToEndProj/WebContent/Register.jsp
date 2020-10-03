<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
</head>

<body style="background-color:#8A2BE2;">

		<div class="container container1">

		<form method="post" action="register">
		<h2 style="text-align:center;font-weight:700;color:white;">Registration Form</h2>
		  <br>
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label >FirstName</label>
		      <input type="text" class="form-control" name="firstname" id="firstname">
		    </div>
		    <div class="form-group col-md-6">
		      <label>LastName</label>
		      <input type="text" class="form-control" name="lastname" id="lastname">
		    </div>
		  </div>
		  <div class="form-group ">
		      <label>Username</label>
		      <input type="text" class="form-control" name="username" id="username">
		    </div>
		  <div class="form-group">
		    <label>Password</label>
		    <input type="password" class="form-control" name="password" id="password" >
		  </div>
		  <!--  <div class="form-group">
		    <label >Confirm Password</label>
		    <input type="password" class="form-control" name="confirmpassword" id="confirmpassword" >
		  </div>-->
		 
		    
		  <button type="submit" class="btn btn-primary">Sign up</button>
		  
		  		
			<p style="margin-top:5%; color:white;text-justify:center; text-align:center;"><%
			String k= (String)request.getAttribute("mssg");
			out.println(k);
			
			
			%></p>
			<br>
			<a href="Login.jsp" style="float:right;color:white;">Go to login page</a>
			
		</form>
		
		</div>
		
		


</body>
</html>