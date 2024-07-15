<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Enquiry Form</h2>

	<form:form modelAttribute="student" action="save" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobuttons path="gender" items="${gender}" /></td>
			</tr>
			<tr>
				<td>Course:</td>
				<td><form:select path="course">
						<form:option value="">-select an option-</form:option>
						<form:options items="${courses}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${preferredTimings}" path="timings" />
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
	<p>
		<font color="green">${message}</font>
	</p>

	<hr>

</body>
</html>