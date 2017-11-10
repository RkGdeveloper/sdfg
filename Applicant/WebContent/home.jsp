<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sff"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${appTitle}</h1>
<hr/>

<sff:form action="addApplicant.obj" modelAttribute="applDetails">

	Applicant Name: <sff:input path="appName" type="text"/> <br/>
	Applicant Age: <sff:input path="appAge" type="number"/> <br/>
	Applicant Date: <sff:input path="appDate" type="text"/> <br/>
	Applicant Designation: <sff:input path="appDesig" type="text"/> <br/>
	Applicant Occupation: <br/>
	<sff:radiobutton path="appOccp" value="working"/>Working<br/>
	<sff:radiobutton path="appOccp" value="student"/>Student<br/>
	
	<sff:select path="appCourse" items="${courseSet}" />
	<br/>
	
	<sff:button>Add Details of Applicant</sff:button>

</sff:form>


</body>
</html>