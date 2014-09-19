<form class="form-horizontal" method="post" action="<c:url value="/usuarios/save"></c:url>">
	<label>Nome</label>
	<input type="text" name="usuario.nome" value="${usuario.nome}"  />
	
	<label>Login</label>
	<input type="text" name="usuario.login"  value="${usuario.login}" />
	
	<label>Senha</label>
	<input type="text" name="usuario.senha" value="${usuario.senha}" />
	
	<button class="btn btn-danger" type="submit">Salvar</button>
</form>