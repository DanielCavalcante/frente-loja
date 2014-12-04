<div class="row">
	<div class="col-md-12">
		<a href="<c:url value="/usuarios" />">
			<button class="btn btn-default"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar</button>
		</a>
	</div>
</div>
<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<form role="form" action="<c:url value="/usuarios/save"></c:url>" method="post">
			<input type="hidden" name="usuario.id" value="${usuario.id}" />
			<div class="form-group">
			  <label for="nome"><fmt:message key="usuario.nome" /></label>
			  <input type="text" class="form-control" name="usuario.nome" value="${usuario.nome}">
			</div>
			<div class="form-group">
			  <label for="login"><fmt:message key="usuario.login" /></label>
			  <input type="text" class="form-control" name="usuario.login"  value="${usuario.login}">
			</div>
			<div class="form-group">
			  <label for="senha"><fmt:message key="usuario.senha" /></label>
			  <input type="password" class="form-control" name="usuario.senha" value="${usuario.senha}">
			</div>
			<button type="submit" class="btn btn-success"><fmt:message key="button.save" /></button>
		</form>
	
	</div>
</div>