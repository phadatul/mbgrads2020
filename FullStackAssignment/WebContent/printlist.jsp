<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>To-Do List</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<style>
        	body{
        	background-image: url(to-do-list.jpg);
        	}
        </style>
	</head>
	<body>
		<a href="homepage.html" type="button" class="btn btn-link">Homepage</a>
		<center><h1 class="display-4">Your To-Do List</h1><br/>
		<%
		List listt = (ArrayList) request.getAttribute("datagg");
		if(listt.isEmpty()) {
			out.println("The list is empty.");
		} else {
			Iterator i = listt.iterator();
			<table>
			while(i.hasNext()) {
				out.print(i.next()+"<br/>");
			}
		}
		%></center>
	</body>
</html>