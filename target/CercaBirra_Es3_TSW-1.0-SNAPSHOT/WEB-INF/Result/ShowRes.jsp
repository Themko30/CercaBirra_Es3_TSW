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
    Iterator it = styles.iterator();
    while (it.hasNext()) {
        out.print("<br>Try: " + it.next());
    }
%>

</body>
</html>
