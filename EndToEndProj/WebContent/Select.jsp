<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxDatatypes.Array"%>
<%@page import="com.harry.datalayer.Todo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" href="style2.css">
<style>
thead{
color:white;
}
td{
color:white;

}
</style>
</head>

<body style="background-color:#8A2BE2;">

		<div class="container container2" >

		<form method="post" action="Todo">
		  <h2 style="text-align:center;font-weight:700;color:white;">Show selected Task</h2>
		  <label>Todo Status</label> 
			  <select class="form-control"
			      name="is_Done">
			      <option value="true">Done</option>
			      <option value="false">Pending</option>
			      
			  </select>
		  
		  <div style=" padding:2%;">
		  <button type="submit" class="btn btn-primary" name="btn-sub" value="show1" style="display:block;width:70%;margin:0 auto;">Show</button>
		  
		  
		  	
		   
		  
		  </div>
		  
		  
		  	<table class="table table-bordered">
			    <thead>
			     <tr>
			      <th>Title</th>
			      <th>Target Date</th>
			      
			      <th>Username</th>
			      <th>Description</th>
			      <th>Status</th>
			      
			      
			     </tr>
			    </thead>
			    <tbody>
			    
			    
			    <c:forEach items="${listTodo1}" var="dataItem">
			        <tr>
			            <td>${dataItem.title}</td>
			            <td>${dataItem.targetDate}</td>
			           
			             <td>${dataItem.username}</td>
			              <td>${dataItem.description}</td>
			              <td>${Boolean.toString(dataItem.status).equals("true") ? "Done" : "Pending"}</td>
			              
		
			            
			            
			        </tr>
			    </c:forEach>

			    
			
			      
			
			       
			    </tbody>
			
			   </table>
		  
		
		</form>
		
			
		
		</div>
		
		
		


</body>
</html>


