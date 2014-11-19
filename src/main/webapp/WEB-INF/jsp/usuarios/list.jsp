<a href='<c:url value='/usuarios/cadastro' />' class="btn btn-success">Cadastro</a>
<table class="table table-hover">
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
				<td><a href="<c:url value='/usuarios/edit/${u.id}' />">Editar</a></td>
				<td><a href="<c:url value='/usuarios/delete/${u.id}' />">Excluir</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
