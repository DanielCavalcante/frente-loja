<h5><fmt:message key="sistema.sub.titulo" /></h5>
<nav class="navbar navbar-inverse" style="margin-top: 10px;">
	<div class="container-fluid">
		<a class="navbar-brand" href="${context}/index"><fmt:message key="sistema.titulo" /></a>
		<ul class="nav navbar-nav">
			<li><a href="${context}/clientes"><fmt:message key="menu.clientes" /></a></li>
			<li><a href="${context}/categorias/cadastro"><fmt:message key="menu.categoria" /></a></li>
			<li><a href="${context}/usuarios"><fmt:message key="menu.usuario" /></a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="${context}/usuarios"><span class="glyphicon glyphicon-user"></span></a></li>
			<li><a href="${context}/logout"><span class="glyphicon glyphicon-log-out"></span></a></li>
		</ul>
	</div>
</nav>
