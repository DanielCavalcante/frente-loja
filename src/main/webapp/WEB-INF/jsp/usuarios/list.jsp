<a href='<c:url value='/usuarios/cadastro' />' class="btn btn-success">Cadastro</a>
<table class="table table-hover table-condensed">
	<thead>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Login</th>
			<th>Senha</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${usuarioList}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.nome}</td>
				<td>${u.login}</td>
				<td>${u.senha}</td>
				<td><a href="<c:url value='/usuarios/edit/${u.id}' />"><button class="btn btn-warning btn-xs"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar</button></a></td>
				<td><a href="<c:url value='/usuarios/delete/${u.id}' />"><button class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Excluir</button></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
