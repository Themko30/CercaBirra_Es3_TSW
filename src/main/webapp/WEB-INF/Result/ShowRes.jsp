<%@ page import="java.awt.List" %>
<%@ page import="java.util.*" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Beer Recommendations</title>
</head>
<body>
<h1>
    Recommendations:
</h1>
<br>
<%
    List styles = (List) request.getAttribute("styles");
    for (int i = 0; i < styles.getItemCount(); i++) {
        out.print("<br>Try: " + styles.next);
    }
%>

</body>
</html>
