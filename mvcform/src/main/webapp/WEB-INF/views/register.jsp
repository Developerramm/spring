<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
               <div class="card">
                <h3 class="card-header text-center">Register page</h3>
                <div class="card-body">
                    <form action="/mvcform/createUser" method="post">
                        <div class="mb-3">
                            <label class="form-label">Name : </label>
                            <input type="text" class="form-control" name="name">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email : </label>
                            <input type="email" class="form-control" name="email">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Password : </label>
                            <input type="password" class="form-control" name="password">
                        </div>
                        <button  type="submit" class="btn btn-primary col-md-12">Register</button>
                    </form>
                </div>
               </div>
            </div>
        </div>
    </div>
</body>
</html>