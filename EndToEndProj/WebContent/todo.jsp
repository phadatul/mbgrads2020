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

		<div class="container container1" style="padding:40px;">

		
		  <h2 style="text-align:center;font-weight:700;color:white;">Select the Option</h2>
		  <br>
		    <button onclick="window.location.href='TodoList.jsp'" type="submit" class="btn btn-primary btn-lg btn-block" name="btn1" value="add_btn">Insert</button>
			<button onclick="window.location.href='Select.jsp'" type="submit" class="btn btn-dark btn-lg btn-block" name="btn2" value="select_btn">Select </button>
			<button onclick="window.location.href='list.jsp'" type="submit" class="btn btn-success btn-lg btn-block" name="btn3" value="select_all">Select All</button>
			<button onclick="window.location.href='update.jsp'" type="submit" class="btn btn-warning btn-lg btn-block" name="btn4" value="update">Update</button>
			<button onclick="window.location.href='Delete.jsp'" type="submit" class="btn btn-danger btn-lg btn-block" name="btn5" value="delete">Delete</button>
		  
		  
		  
		  
		
		
		
		</div>
		
		

			
		
		


</body>
</html>