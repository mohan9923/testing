<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<head>
  <meta charset="UTF-8">
  
      
</head>

<body>

  <div class="wrapper">
	<div class="container">
		<title>Registration</title>
		
		<form action="registrationaction.htm" method="post">
           <form class="form">
           
       
      
            <br>  Name* <input type="text" name="name" ></br>
             <br>  User Name*<input type="text" name="username"></br>
              <br>  E-Mail*<input type="email" name="email"></br>
             <br>   Password* <input type="password" name="password"><br>
              <br>  Confirm Password*<input type="password" name="confirmpassword"><br>
             <br> <input type="submit" name="signup" value="Sign Up"></br>
            <a  href="login.jsp">login</a>
               <%if(request.getAttribute("errorMessage")!=null){ %>
 <span style="color:red"><%=request.getAttribute("errorMessage") %></span> <%} %>
 <%if(request.getAttribute("duplicateErrorMessage")!=null){ %>
 <span style="color:red"><%=request.getAttribute("duplicateErrorMessage") %></span> <%} %>
 <%if(request.getAttribute("passwordErrorMessage")!=null){ %>
 <span style="color:red"><%=request.getAttribute("passwordErrorMessage") %></span> <%} %>

		</form>
	
	




</body>

</html>
