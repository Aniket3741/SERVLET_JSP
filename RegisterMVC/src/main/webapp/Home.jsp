<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Success</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body class="bg-warning">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<form>
					<div class="card">
						<div class="card-header bg-success text-white">
							<h3>Registration Successfull</h3>
						</div>
						<div class="card-body bg-secondary">
							<div class="form-group mb-3">
								<input type="email" name="email" placeholder="Enter your email"
									class="form-control" autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="password" name="email" placeholder="Enter your password"
									class="form-control" autocomplete="off" required>
							</div>
						</div>

						<div class="card-footer text-center bg-primary text-white">
							<button type="submit" class="btn btn-danger">Login</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>

</html>