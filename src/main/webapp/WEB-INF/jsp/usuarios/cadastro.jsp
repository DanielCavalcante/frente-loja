<form class="form-horizontal" method="post" action="<c:url value="/usuarios/save"></c:url>">
	<input type="hidden" name="usuario.id" value="${usuario.id}" />
	<div class="col-md-3">
		<div class="row">
			<button class="btn btn-success" type="submit">Salvar</button>
		</div>
		<div class="row">
			<label>Nome</label>
			<input class="form-control" type="text" name="usuario.nome" value="${usuario.nome}"  />
			<label>Login</label>
			<input class="form-control" type="text" name="usuario.login"  value="${usuario.login}" />
			<label>Senha</label>
			<input class="form-control" type="text" name="usuario.senha" value="${usuario.senha}" />
		</div>
	</div>
	
	
</form>