<%@page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login page </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1>This is login page here </h1>

    <!-- <%
        String city = (String) request.getAttribute("city");
        String key = (String) request.getAttribute("key");
    %>

    <%= city %>
    <%= key %> -->

    <h3> city ${city} </h3>
    <h3> key :  ${key} </h3>


</body>
</html>