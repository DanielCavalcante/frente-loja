<!DOCTYPE html>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript"> URL = '${context}';</script>
		<link href="${context}/css/bootstrap.min.css" rel="stylesheet">
		<link href="${context}/css/bootstrap-theme.min.css" rel="stylesheet">
		<title>Frente de Loja</title>
		<decorator:head/>
	</head>
	<body>
		<div class="container">
			<div id="conteudo" class="conteudo">
				<decorator:body/>
			</div>
			<script src="${context}/js/bootstrap.min.js"></script>
			<script src="${context}/js/jquery-2.1.1.min.js"></script>
		</div>
	</body>
</html>