<div class="row">

	<div class="col-md-12">
		<a href="<c:url value='/categorias/json' />" class="btn btn-info pull-right">
			<span class="glyphicon glyphicon-export" aria-hidden="true"></span> <fmt:message key="button.jsonAll" />
		</a>
	</div>

</div>
<div class="row">
	<div class="col-md-4 col-md-offset-3">
		<form role="form" style="margin-bottom: 2em;">
			<input type="hidden" id="idCategoria" name="categoria.id" value="${categoria.id}" />
			<div class="form-group">
				<label><fmt:message key="categoria.nome" /></label>
				<input type="text" id="nome" name="categoria.nome" class="form-control" placeholder='<fmt:message key="categoria.nome" />'/>
			</div>
			<div class="form-group">
				<label><fmt:message key="categoria.descricao" /></label>
				<textarea id="descricao" name="categoria.descricao" class="form-control" placeholder='<fmt:message key="categoria.descricao" />' rows="3"></textarea>
			</div>
			<a href="javascript:void(0)" onclick="saveCategoria()" class="btn btn-success"><fmt:message key="button.save" /></a>
		</form>
	</div>
</div>

<div class="row">
	<div class="col-md-7 col-md-offset-2">
		<table id="tabela" class="table table-hover">
			<tr>
				<th><fmt:message key="categoria.id" /></th>
				<th><fmt:message key="categoria.nome" /></th>
				<th><fmt:message key="categoria.descricao" /></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${listCategorias}" var="c">
			<tr id="registro_${c.id}">
				<td>${c.id}</td>
				<td>${c.nome}</td>
				<td>${c.descricao}</td>
				<td>
					<a href="javascript:void(0)" onclick="del(${c.id})"><button class="btn btn-danger btn-xs">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> <fmt:message key="button.excluir" /></button>
					</a>
				</td>
				<td>
					<a href="<c:url value='/categorias/json/${c.id}'  />" class="btn btn-info btn-xs">
						<span class="glyphicon glyphicon-export" aria-hidden="true"></span> <fmt:message key="button.json" />
					</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</div>
<js:import javascript="categoria.js"></js:import>
