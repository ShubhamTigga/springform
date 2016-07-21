<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.formFieldError { background-color: white;color:red; }
</style>

</head>
<body>
<h1>User Registration Form</h1>
<mvc:form modelAttribute="s" action="result" method="post">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="name" /></td>
<td><mvc:errors path="name" cssClass="formFieldError"/></td>
</tr>
<tr>
<td>Mobile No.</td>
<td><input type="text" name="mobile_no" maxlength="10" /></td>
<td><mvc:errors path="mobile_no" cssClass="formFieldError"/></td>
</tr>
<tr>
<td>Complain Message</td>
<td><textarea name="complain" cols="20" rows="5"></textarea></td>
<td><mvc:errors path="complain" cssClass="formFieldError"/></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Submit" />
</td>
</tr>
</table>
</mvc:form>
</body>
</html>