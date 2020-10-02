<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Meaning</title>
</head>
<body style="background-image: url(dictionary.jpg)">
<br>
<br>
 <h2 style="color: white;">
<%
String str1=(String) request.getAttribute("Meaning");
if(str1!=null)
{
	out.print(str1);
}

%>
<br>
<%
String str2=(String) request.getAttribute("Synonym");
if(str2!=null)
{
	out.print(str2);
}

%>
<br>
<%
String str3=(String) request.getAttribute("Antonym");
if(str3!=null)
{
	out.print(str3);
}

%>
</h2>
<br>
<br>
<form action="RedirectServlet" method="post">
<button type="submit" class="btn btn-primary">Search Another Word</button>
</form>
<br>


</body>
</html>