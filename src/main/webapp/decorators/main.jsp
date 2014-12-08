<!DOCTYPE html>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link href="${context}/css/bootstrap.min.css" rel="stylesheet">
		<link href="${context}/css/bootstrapDataTables.css" rel="stylesheet">
<%-- 	<link href="${context}/css/bootstrap-theme.min.css" rel="stylesheet"> --%>
		<title><fmt:message key="sistema.titulo" /></title>
		<decorator:head/>
		<style type="text/css">
			.dt-bootstrap {
				margin-top: 30px;
			}
			.glyphicon-log-out {
				color: #FF3A3A;
			}
			.glyphicon-user {
				color: #1B8E2A;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div id="menu" class="col-md-12">
					<jsp:include page="menu.jsp"></jsp:include>
				</div>
			</div>
			<div class="row">
				<div id="conteudo" class="col-md-12">
					<msg:messages />
					<decorator:body/>
				</div>
			</div>
			<script src="${context}/js/jquery-2.1.1.min.js"></script>
			<script src="${context}/js/bootstrap.min.js"></script>
			<script src="${context}/js/dataTables.min.js"></script>
			<script src="${context}/js/bootstrapDataTables.js"></script>
			<script src="${context}/js/jquery.MaskInput.js"></script>
			<script src="${context}/js/scripts.js"></script>
			<c:forEach items="${jsImports}" var="js">
				<script type="text/javascript" src="${context}/js/${js}"></script>
			</c:forEach>
		</div>
	</body>
</html>
