<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome, ${emailId}</h1>
 <br><br>
 <h1>Based on your skills the available projects are: </h1>
     <c:forEach items="${projectList}" var="pro">
        <h1> ${pro.projectName}</h1></br> 
      </c:forEach>
</body>
</html>