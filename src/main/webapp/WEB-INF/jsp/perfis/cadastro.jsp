<form class="form-horizontal" action="<c:url value="/perfis/save" />" method="post">
	<input type="hidden" name="perfil.id" value="${perfil.id}" />
	<input class="btn btn-success" value="Salvar" type="submit">
	<div class="col-md-4">
		<label>Nome</label>
		<input type="text" name="perfil.nome" value="${perfil.nome}" />
		
		<label>Permissoes</label>
		<div class="col-sm-4">
			<c:forEach items="${permissaoList}" var="p">
				<div class="checkbox">
					<input name="listaPermissoes" value="${p.nome}" type="checkbox" ${p.checked ? "checked" : ""}/>
					<fmt:message key="${p.nome}" />
				</div>
			</c:forEach>
		</div>
	</div>
</form>