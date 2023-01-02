<%@ page  isELIgnored="false" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>this is demo page</h2>
Student Id = ${stud_id} <br>
Student Name = 	${stud_name} <br>
Student subjects = 	${subjects}<br>

<%-- <% 
List<String> sub = (List<String>)request.getAttribute("subjects");
for(String e:sub)
{%>
	<% out.println(e); %> <br>
<%}
%> --%>
<h3><b>subjects are as follows : </b></h3>
<c:forEach var="sub" items="${subjects}">
${sub}<br>
</c:forEach>

</body>
</html>
