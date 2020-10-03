<%@page import="com.casestudy.entityModel.Professional"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Table PROF</title>
</head>
<body>
   <%
  
	ArrayList l = new ArrayList();
   
    
	l = (ArrayList) request.getAttribute("Result");
	int sz=(l.size());
	//Object[] ob=null;
	out.println(l);


	//Object o=l.get(1);
	//String[] s=o.toString().split(" ");
	//out.println(s[3]);
	
	
	%>

	<table id="table" class="table table-bordered table-dark">

		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">ID</th>
				<th scope="col">NAME</th>
				<th scope="col">BASIC</th>
				<th scope="col">GROSS</th>
				<th scope="col">NET</th>
			</tr>
		</thead>
		
				<tbody id="myTable">
				<% for(int i=0;i<l.size();i++ ) {%>
					<tr > 
				  	<th scope="row"><% out.print(i+1); %></th>
				  	<td><% out.println(l.get(i)) ;%></td> 
				  	<td>ABC</td>  
				  	<td>00</td> 
				  	<td>00</td> 
				  	<td>00</td> 
				  </tr>
					
				<%} %>
				  
			


				</tbody>



	</table>
	



</body>


</html>