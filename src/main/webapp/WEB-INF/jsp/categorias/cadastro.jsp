<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<form role="form" style="margin-bottom: 2em;">
			<input type="hidden" id="idCategoria" name="categoria.id" value="${categoria.id}" />
			<div class="form-group">
				<label><fmt:message key="categoria.nome" /></label>
				<input type="text" id="nome" name="categoria.nome" class="form-control" placeholder='<fmt:message key="categoria.nome" />'/>
			</div>
			<div class="form-group">
				<label><fmt:message key="categoria.descricao" /></label>
				<input type="text" id="descricao" name="categoria.descricao" class="form-control" placeholder='<fmt:message key="categoria.descricao" />'/>
			</div>
			<a href="javascript:void(0)" onclick="saveCategoria()" class="btn btn-success">Salvar</a>
		</form>
	</div>
</div>

<div class="row">
	<div class="col-md-12">
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
				<td><a href="javascript:void(0)" onclick="del(${c.id})">
					<button class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Excluir</button>
				</a></td>
				
			</tr>
			</c:forEach>
			
			
			
			
			
			
		</table>
	</div>
</div>
<js:import javascript="categoria.js"></js:import>
