<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add a Word</title>
</head>
 <body style="background-image: url(dictionary.jpg)">
            <div>
            
           <h1 style="text-align: center; color:blueviolet"> Dictionary </h1>
              </div>
              <div class="container">
                    <form action="AddServlet" method="post">
                        <div class="form-group">
                          <label ><h4 style="color: white;">Enter a word</h4></label>
                          <input type="text" class="form-control" name="word" placeholder="Enter a new word!!">
                         
                        </div>
                        <br>
                        <br>
                         <div class="form-group">
                          <label ><h4 style="color: white;">Meaning</h4></label>
                          <input type="text" class="form-control" name="meaning" placeholder="Enter the meaning!!">
                         
                        </div>
                        <br>
                        <br>
                         <div class="form-group">
                          <label ><h4 style="color: white;">Synonym</h4></label>
                          <input type="text" class="form-control" name="synonym" placeholder="Enter synonyms!!">
                         
                        </div>
                        <br>
                        <br>
                         <div class="form-group">
                          <label ><h4 style="color: white;">Antonym</h4></label>
                          <input type="text" class="form-control" name="antonym" placeholder="Enter antonyms!!">
                         
                        </div>
                       <br>
                <br>

                        
                        <button type="submit" class="btn btn-primary mr-1 " name="ops">Add</button>
                        
                        
                      </form>
                      <br>
                      <form action="RedirectServlet" method="post">
						<button type="submit" class="btn btn-primary">Search Another Word</button>
						</form>
                      
                      
							                      
                     
                </div>
                


</body>
</html>