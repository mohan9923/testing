
<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<meta charset="UTF-8">
<title>Calm breeze login screen</title>

</head>

<body>

			<form action="log.htm" method="post">
				<h1>login</h1>
				<form class="form">
					<br>Username <b><input  type="text" name="username"></br> <b>
					<br>Password<input  type="password" name="password"> </br> <b>
					<br><input type="submit" name="Login" value="Login"></br> <b><a
									href="registration.jsp"><b>Register</a>
								</p>
									</br> <%if(request.getAttribute("errorMessage")!=null){ %> <span
									style="color: red"><%=request.getAttribute("errorMessage") %></span>
									<%} %> <%if(request.getAttribute("autherrorMessage")!=null){ %> <span
									style="color: red"><%=request.getAttribute("autherrorMessage") %></span>
									<%} %>
				</form>
		</div>

		



</body>

</html>
