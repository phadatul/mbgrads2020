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

		<form method="post" action="login">
		  <h2 style="text-align:center;font-weight:700;color:white;">Login Form</h2>
		  <br>
		  
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
		 
		    </br>
		    </br>
		  <div style="width:100%;margin:0 auto; padding:2%;"><button type="submit" class="btn btn-primary" style="display:inline-block;">Sign in</button>
		  <button type="submit" class="btn btn-danger" style="display:inline-block;">Cancel</button>
		  
		  
		  	
		   <p style="margin-top:20%; color:white;text-justify:center;"><%
			   	 String k=null;
				 k= (String)request.getAttribute("mssg");
			   	if (k!=null){
			   		out.println(k);
			   		request.setAttribute("mssg","abc");
			   	}
			   	
			   	
		   	%></p>
		   	
		   	 	<a href="Register.jsp" style="float:right;color:white;">New User? Click on this link to Register</a>
		   	 	<br>
		  
		  </div>
		  
	
		</form>
		
		</div>
		
		
		


</body>
</html>