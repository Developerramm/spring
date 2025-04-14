<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h3>Home page </h3>

    <!-- <% 
       String name = (String)request.getAttribute("name");
    %> -->

    <h3>My name is : ${name} </h3>
    
    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Itaque placeat officia, ratione laborum commodi quasi nobis et voluptates perferendis est deleniti. Laborum libero minus labore quos eius quasi aperiam rerum!</p>
</body>
</html>