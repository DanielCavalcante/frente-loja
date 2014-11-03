<form class="form-horizontal" action="<c:url value="/clientes/save" />" method="post">
	<input type="hidden" name="cliente.id" value="${cliente.id}" />
	
	<div>
		<a href="<c:url value="/clientes" />" class="btn btn-default">Voltar</a>
		<button type="submit" class="btn btn-success">Salvar</button>
	</div>
	<div class="col-md-5">
		<label>Nome</label>
		<input type="text" name="cliente.nome" value="${cliente.nome}" class="form-control"/>
	
		<label>CPF</label>
		<input type="text" name="cliente.cpf" value="${cliente.cpf}" class="form-control"/>
		
		<label>Email</label>
		<input type="text" name="cliente.email" value="${cliente.email}" class="form-control"/>
		
		<label>Telefone</label>
		<input type="text" name="cliente.telefone" value="${cliente.telefone}" class="form-control"/>
	
		<label>Tipo pessoa</label>
		<select name="cliente.tipoPessoa" class="form-control">
			<option value="">Selecione</option>
			<c:forEach items="${tipoPessoa}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
		</select>
	</div>
</form>