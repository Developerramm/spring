<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login page </title>
</head>
<body>
    <h1>This is login page here </h1>

    <%
        String city = (String) request.getAttribute("city");
        String key = (String) request.getAttribute("key");
    %>

    <%= city %>
    <%= key %>
</body>
</html>