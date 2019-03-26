<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="registerUser">
 
 First Name <input type="text" name="firstName"><br>
 Last Name <input type="text" name="lastName"><br>
 Email  <input type="text" name="emailId"><br>
 Phone Number <input type=text" name="phoneNumber"><br>
 Password  <input type="password" name="password"><br>
 <input type="checkbox" name="skill1" value="PHP"> PHP <br>
 <input type="checkbox" name="skill2" value="HTML"> HTML <br>
 <input type="checkbox" name="skill3" value="Javascript"> Javascript <br>
 <input type="checkbox" name="skill4" value="MySQL"> MySQL <br>
 <input type="checkbox" name="skill5" value="Java"> Java <br>
 <input type="checkbox" name="skill6" value="Python"> Python <br>
 <input type="checkbox" name="skill7" value=".NET"> .NET <br>
 <input type="checkbox" name="skill8" value="Angular.js"> Angular.js <br>
 <input type="checkbox" name="skill9" value="Unity 3D"> Unity 3D <br>
 <input type="checkbox" name="skill10" value="Laravel"> Laravel <br> 
 Submit <input type="submit"><br>
 
</form>
Already Registered? <a class="btn btn-warning" href="userLoginPage">SignIn</a>
</body>
</html>