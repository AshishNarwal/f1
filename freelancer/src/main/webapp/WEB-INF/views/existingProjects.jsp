<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Existing Projects</title>
</head>
<body>
<table>
<tr>
<td>Project Name</td>
<td>Project Duration</td>
<td>Project Admin Id</td>
</tr>
<c:forEach items="${pro}" var="project">
<tr>
<td>${project.projectName}</td>
<td>${project.projectDuration }</td>
 <td>${project.adminId }</td>
</tr>
</c:forEach>
</table>
</body>
</html>