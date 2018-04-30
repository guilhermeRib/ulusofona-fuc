<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="pt">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="Guilherme Ribeiro">
<link rel="icon" href="">

<title>Login - Modulo FUC</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value="/resources/css/signin.css" />"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputNumeroProfessor" class="sr-only">Número
				Professor</label> <input type="text" id="inputNumeroProfessor"
				class="form-control" placeholder="Número Professor" required
				autofocus> <label for="inputPassword" class="sr-only">Password</label>
			<input type="password" id="inputPassword" class="form-control"
				placeholder="Password" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me"
					id="checkboxRememberMe"> Lembrar credenciais
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Aceder</button>
		</form>
	</div>
	<!-- /container -->
</body>
</html>
