<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Welcome ${user}</h1>
  <br><br>
  <h2><a href="existingProjects">Existing Projects</a></h2>
  <br><br>
   <h>Admin ID= ${adminId }</h>

  <br><h2>Add a new project</h2>
  <br>
  <form action="registerProject">
 Project Name <input type="text" name="projectName"><br>
 Project Duration <input type="text" name="projectDuration"><br>
 Admin Id<input type="text" name="adminId"><br>
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
<input type="submit"><br>
</form>
 ${name}
</body>
</html>