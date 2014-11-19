<form class="form-horizontal">
	<input type="hidden" id="idCategoria" name="categoria.id" value="${categoria.id}" />
	<div>
		<a href="javascript:void(0)" onclick="saveCategoria()" class="btn btn-success">Salvar</a>
	</div>
	<div class="col-md-3">
		<div class="form-group">
			<label><fmt:message key="categoria.nome" /></label>
			<input type="text" id="nome" name="categoria.nome" class="form-control" placeholder='<fmt:message key="categoria.nome" />'/>
		</div>
		<div class="form-group">
			<label><fmt:message key="categoria.descricao" /></label>
			<input type="text" id="descricao" name="categoria.descricao" class="form-control" placeholder='<fmt:message key="categoria.descricao" />'/>
		</div>
	</div>
	<table id="tabela" class="table table-hover">
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Descricao</th>
			<th></th>
		</tr>
		<c:forEach items="${listCategorias}" var="c">
			<tr id="registro_${c.id}">
				<td>${c.id}</td>
				<td>${c.nome}</td>
				<td>${c.descricao}</td>
				<td><a href="javascript:void(0)" onclick="del(${c.id})">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</form>
<js:import javascript="categoria.js"></js:import>
