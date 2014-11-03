<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<link href="${context}/css/bootstrap.min.css" rel="stylesheet" >
		<link href="${context}/css/login.css" rel="stylesheet" >
		<meta charset="UTF-8">
		<title><fmt:message key="sistema.titulo" /></title>
	</head>
	<body>
		<div class="container">
			<form class="form-signin" role="form" action="<c:url value='/autenticar' />" method="post">
				<h3><fmt:message key="sistema.titulo" /></h3>
				<msg:messages />
				<h5 class="form-signin-heading"><fmt:message key="msg.login" /></h5>
				<input type="text" name="usuario.login" class="form-control" placeholder="<fmt:message key="usuario.login" />" required autofocus />
				<input type="password" name="usuario.senha" class="form-control" placeholder="<fmt:message key="usuario.senha" />" required />
				<button type="submit" class="btn btn-lg btn-primary btn-block"><fmt:message key="button.entrar" /></button>
			</form>
		</div>
		<script src="${context}/js/jQuery.js"></script>
		<script src="${context}/js/bootstrap.min.js"></script>
	</body>
</html>		
