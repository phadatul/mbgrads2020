<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dictionary</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <body style="background-image: url(dictionary.jpg)">
            <div>
            
           <h1 style="text-align: center; color:blueviolet"> Dictionary </h1>
              </div>
              <br>
              <br>
              <br>
              <br>
            <div class="container">
                    <form action="DictionaryOpsServlet" method="post">
                        <div class="form-group">
                          <label ><h4 style="color: white;">Enter a word</h4></label>
                          <input type="text" class="form-control" name="word" placeholder="Enter a word to search!(First letter should be in Caps!)">
                         
                        </div>
                        <%
                String str1=(String) request.getAttribute("errormsg");
                if(str1!=null)
                {
                	out.print(str1);
                }

                %><br>
                <br>
                	<div class="row">
                        <button type="submit" class="btn btn-primary mr-1" name="ops" value="search">Search</button>
                        <button type="submit" class="btn btn-primary mr-1 " name="ops" value="add">Add to Dictionary</button>
                       <button type="submit" class="btn btn-primary mr-1 " name="ops" value="update">Update to Dictionary</button>
                        
                        </div>
                      </form>
                      <br>
                      
                     
                </div>
                
                 
        </body>
    </head>
</html>