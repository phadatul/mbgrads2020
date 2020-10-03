<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Juice for Life!!</title>
<style>
body  {
  background-image: url("https://ifu.site-ym.com/resource/resmgr/hphero/fruit_and_juice_main3.png");
  background-color: #cccccc;
}
</style>
</head>
<body>

<center><h1>Welcome to Juice for Life</h1></center>

<h2>Which all Juices Do You Want?</h2>

<form action="DataFileTransform" method="post">
  <!-- input type="hidden" name="hdnbt" /-->
  <input type="checkbox" id = "j1" name="jucies" value="apple">
  <label for="apple"> Apple Juice</label><br>
  <input type="checkbox" id="j2" name="jucies" value="orange">
  <label for="orange"> Orange Juice</label><br>
  <input type="checkbox" id="j3" name="jucies" value="banana">
  <label for="banana"> Banana Juice</label><br>
  <input type="checkbox" id="j4" name="jucies" value="grape">
  <label for="grape"> Grape Juice</label><br>
  <input type="checkbox" id="j5" name="jucies" value="cherry">
  <label for="cherry"> Cherry Juice</label><br>
  <input type="checkbox" id="j6" name="jucies" value="strawberry">
  <label for="strawberry"> Strawberry Juice</label><br>
  <input type="checkbox" id="j7" name="jucies" value="guava">
  <label for="guava"> Guava Juice</label><br>
  <input type="checkbox" id="j8" name="jucies" value="mango">
  <label for="mango"> Mango Juice</label><br>
  <input type="checkbox" id="j9" name="jucies" value="papaya">
  <label for="papaya"> Papaya Juice</label><br>
  <input type="checkbox" id="j10" name="jucies" value="pineapple">
  <label for="pineapple"> Pineapple Juice</label><br><br>
  <input type="submit" name="order" value="Order Now!"/>&nbsp;
  <!-- input type="submit" name="check" value="Check for discounts" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}">
  <br><br>
  
  <input type="submit" name="pay" value="Pay Now!" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}"/-->
</form>

<%! String[] juices; %>
<% 
   /*juices = request.getParameterValues("juicer");
   if (juices != null) 
   {
      for (int i = 0; i < juices.length; i++) 
      {
         out.println ("<b>"+juices[i]+"<b>");
      }
   }*/
   
   
   List<String> juicy  = (List<String>) request.getAttribute("juicer");
   //int i = 0;
   //out.println(juicy);
   if (juicy != null) 
   {
      for (int i = 0; i < juicy.size(); i++) 
      {
         out.println ("<b>"+juicy.get(i)+"<b><br>");
      }
   }
   /*for(int i = 0;i< juicy.size();i++)
   {
   		out.println(juicy.get(i));
   }*/
   /*for(String j: juicy){
	   out.println(j);
	   
   }*/

%>


</body>
</html>