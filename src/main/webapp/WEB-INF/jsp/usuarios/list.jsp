<div class="row">
	
	<table class="table table-hover table-striped">
		<thead>
			<tr class="">
				<th>Nome</th>
				<th>Login</th>
				<th>Senha</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${usuarioList}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.nome}</td>
					<td>${u.login}</td>
					<td>${u.senha}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>