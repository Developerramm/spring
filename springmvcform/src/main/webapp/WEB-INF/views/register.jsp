<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Register page</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-md-6 offset-md-3">
          <div class="card p-3">
            <div class="card-body">
              <h3 class="text-center mb-2">Registration Form</h3>
              <form action="/springmvcform/createUser" method="post">
                <div class="mb-3">
                  <label class="form-label">Name </label>
                  <input
                    type="text"
                    class="form-control"
                    name="name"
                    autocomplete="off"
                  />
                </div>
                <div class="mb-3">
                  <label class="form-label">Email </label>
                  <input
                    type="email"
                    class="form-control"
                    name="email"
                    autocomplete="off"
                  />
                </div>
                <div class="mb-3">
                  <label class="form-label">Password </label>
                  <input
                    type="password"
                    class="form-control"
                    name="password"
                    autocomplete="off"
                  />
                </div>
                <div class="mb-3">
                  <label class="form-label">image </label>
                  <input
                    type="text"
                    class="form-control"
                    name="image"
                    autocomplete="off"
                  />
                </div>
                <button type="submit" class="btn btn-primary col-md-12">Submit</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
