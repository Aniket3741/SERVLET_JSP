<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MVC and MySQL</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body class="bg-primary">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form name="form" action="RegisterServlet" method="post"
					onsubmit="return validate()">
					<div class="card">
						<div class="card-header bg-dark text-white">
							<h3>Java Registration application using MVC and MySQL</h3>
						</div>
						<div class="card-body bg-secondary">
							<div class="form-group mb-3">
								<input type="text" name="fullname"
									placeholder="Enter your fullname" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="email" name="email" placeholder="Enter your email"
									class="form-control" autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="text" name="username"
									placeholder="Enter your usernmae" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="password" name="password"
									placeholder="Enter your password" class="form-control"
									autocomplete="off" required>
							</div>
							<div class="form-group mb-3">
								<input type="password" name="conpassword"
									placeholder="Enter your confirm password" class="form-control"
									autocomplete="off" required>
							</div>
						</div>
						<div class="card-footer text-center bg-dark text-white">
							<button type="submit" name="submit" value="submit"
								class="btn btn-outline-light">Submit</button>
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