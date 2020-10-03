<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

		<title>Professional Dashboard</title>
		    <style>
		      hr {
		        width: 100%;
		        height: 2px;
		        margin-left: auto;
		        margin-right: auto;
		        background-color: #595853;
		      }
		    </style>
		
</head>

<body background="https://www.asocscloud.com/wp-content/uploads/2017/07/grey-wallpaper-background.jpg">


	
	 <div class="container">

           <div class="row">
                <div class="col-lg-6"> 
                    <form action="MyServlet" method="post">
                      <h4 style="color: rgb(245, 65, 33); text-shadow: 2px 2px 1px #000000">Form to add a proffessional</h4>
                        <div class="form-group">
                          <label for="inputId">Professional ID</label>
                          <input type="number" name="profId" placeholder="Input UNIQUE ID number" required="required" class="form-control" id="profId" aria-describedby="idHelp">
                          <small id="idHelp" class="form-text text-muted">You're professional ID will be safe !!</small>
                        </div>

                        <div class="form-group">
                          <label for="inputName">Professional Name</label>
                          <input type="text" name="profName" required="required" class="form-control" id="exampleInputPassword1">
                        </div>

                        <div class="form-group">
                          <label for="BasicSalary">Basic Salary</label>
                          <input type="number" name="basicSalary" placeholder="Provide Basic" required="required" class="form-control" id="profId" aria-describedby="basicHelp">
                          
                        </div>

                        <div class="form-group">
                          <label for="inputId">Medical Allowance</label>
                          <input type="number" name="medical" placeholder="Provide medical" required="required" class="form-control" id="profId" aria-describedby="medicalHelp">
                          
                        </div>

                        <div class="form-group form-check">
                          <input type="checkbox" class="form-check-input" id="exampleCheck1">
                          <label class="form-check-label" for="exampleCheck1">Check me out</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button> 
                      </form>

                </div>
                <div class="col-lg-6" >
                    <form action="RemoveProf" method="post">
                      <h4 style="color: rgb(245, 65, 33); text-shadow: 2px 2px 1px #000000">Form to Delete a proffessional</h4>
                      <div class="form-group">
                        <label for="inputId">Professional ID</label>
                        <input type="number" name="profId" placeholder="Input ID number" required="required" class="form-control" id="profId" aria-describedby="idHelp">
                        <small id="idHelp" class="form-text text-muted">This professional will be removed from list.</small>
                      </div>
                      
                      
                        <button type="submit" class="btn btn-outline-danger">Submit</button>
                      </form>

                </div>
            </div>
            
            <br> <br> <hr /> <br>
            
          
            
            
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
				  	
				  	<tr > 
				  	<th scope="row">1</th>
				  	<td>1</td> 
				  	<td>ABC</td>  
				  	<td>99000</td> 
				  	<td>99000</td> 
				  	<td>99000</td> 
				  	</tr>
				  	
				  	<tr >
				  	<th scope="row">2</th>
				  	<td>2</td> 
				  	<td>xyz</td>  
				  	<td>99000</td> 
				  	<td>99000</td> 
				  	<td>99000</td> 
				  	</tr>
					
					
				  </tbody>

			
				
			</table>
            
        </div>
   
        

                       


   
 
        
	
	
	
	

</body>
</html>