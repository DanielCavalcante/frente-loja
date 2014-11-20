<div class="row">
	<div class="col-md-12">
		<a href="<c:url value="/clientes" />">
			<button class="btn btn-default"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar</button>
		</a>
	</div>
</div>

<div class="row">
	<div class="col-md-6 col-md-offset-3">

		<form role="form" action="<c:url value="/clientes/save" />" method="post">
			<input type="hidden" name="cliente.id" value="${cliente.id}" />
			<div class="form-group">
			  <label for="nome">Nome</label>
			  <input type="text" class="form-control" name="cliente.nome" value="${cliente.nome}">
			</div>
			<div class="form-group">
			  <label for="cpf">CPF</label>
			  <input type="text" class="form-control cpf" name="cliente.cpf" value="${cliente.cpf}">
			</div>
			<div class="form-group">
			  <label for="email">Email</label>
			  <input type="text" class="form-control" name="cliente.email" value="${cliente.email}">
			</div>
			<div class="form-group">
			  <label for="telefone">Telefone</label>
			  <input type="text" class="form-control telefone" name="cliente.telefone" value="${cliente.telefone}">
			</div>
			<div class="form-group">
				<label for="telefone">Tipo pessoa</label>
				<select name="cliente.tipoPessoa" class="form-control">
					<option value="">Selecione</option>
					<c:forEach items="${tipoPessoa}" var="t">
						<option value="${t}">${t}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-success">Salvar</button>
		</form>
	
	</div>
</div>

<script>

	document.addEventListener("DOMContentLoaded", function(event) {
		$(".cpf").mask("999.999.999-99");
		$(".telefone").mask("(99) 9999-9999");
	});

</script>