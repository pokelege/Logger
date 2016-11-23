<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logstring</title>
</head>
<body>
	<center>
		<h2>Logs</h2>
		<table>
		<tr>
		<th>Instance ID</th>
		<th>Message</th>
		</tr>
		<% java.util.List<com.pokelege.logger.entity.LogString> strings = (java.util.List<com.pokelege.logger.entity.LogString>)request.getAttribute("messages"); %>
        <% for(int i = 0; i < request.getAttribute("messages").size(); ++i) { %>
                <tr>
                <td><%=strings.get(i).getInstanceId()%></td>
                    <td><%=strings.get(i).getMessage()%></td>
                </tr>
            <% } %>
		</table>
	</center>
</body>
</html>