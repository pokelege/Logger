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
        <% for(int i = 0; i < ${messages}.size(); i+=1) { %>
                <tr>
                <td><%=${messages}.get(i).getInstanceId()%></td>
                    <td><%=${messages}.get(i).getMessage()%></td>
                </tr>
            <% } %>
		</table>
	</center>
</body>
</html>