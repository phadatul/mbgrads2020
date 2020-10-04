<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Update Task</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="basicstylesheet.css">
        <style>
        	body{
        	background-image: url(to-do-list.jpg);
        	}
        </style>
    </head>
    <body>
        <a href="homepage.html" type="button" class="btn btn-link">Homepage</a>
        <center><h1 class="display-4">UPDATE A TASK OF YOUR TO-DO LIST</h1>
        <p>Enter details regarding the task to be updated in the to-do list.</p>
        <form action="UpdateTaskServlet" method="post">
            <input type="number" class="form-control" name="id" placeholder="Enter serial number." required/>
            <input type="text" class="form-control" name="status" placeholder="Enter the status of the task." required/>
            <input type="submit" class="btn btn-primary"/>
            <input type="reset" class="btn btn-primary"/>
        </form></center>
         <%
        String s = (String) request.getAttribute("alertji");
        if(s != null) {
        	out.println(s);
        }
        %>
    </body>
</html>