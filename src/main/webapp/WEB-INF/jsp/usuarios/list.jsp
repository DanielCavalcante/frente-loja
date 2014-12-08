<form>
	<a href="<c:url value='/usuarios/cadastro' />" class="btn btn-success"><fmt:message key="button.cadastro" /></a>
	<a href="javascript:void(0)" onclick="del()"><span class="btn btn-danger"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> <fmt:message key="button.excluir" /></span></a>

<table id="clientes" class="table table-hover usuarios table-condensed" cellspacing="0" width="100%">

	<thead>
		<tr>
			<th style="width: 20px;">
				<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
			</th>
			<th><fmt:message key="usuario.id" /></th>
			<th><fmt:message key="usuario.nome" /></th>
			<th><fmt:message key="usuario.login" /></th>
			<th><fmt:message key="usuario.senha" /></th>
			<th></th>
		</tr>
	</thead>
	
	<tfoot>
		<tr>
			<th style="width: 20px;">
				<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
			</th>
			<th><fmt:message key="usuario.id" /></th>
			<th><fmt:message key="usuario.nome" /></th>
			<th><fmt:message key="usuario.login" /></th>
			<th><fmt:message key="usuario.senha" /></th>
			<th></th>
		</tr>
	</tfoot>
	
	<tbody>
		<c:forEach items="${usuarioList}" var="u">
			<tr>
				<td><input type="checkbox" value="${u.id}" name="id"></td>
				<td>${u.id}</td>
				<td>${u.nome}</td>
				<td>${u.login}</td>
				<td>${u.senha}</td>
				<td>
					<a href="<c:url value='/usuarios/edit/${u.id}' />" class="btn btn-warning btn-xs">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> <fmt:message key="button.editar" />
					</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>

</table>
</form>
<script>
function selectAll(checkbox, items) {
	var list = document.getElementsByName(items);
	for (var i=0; i < list.length; i++) {
		list[i].checked = checkbox.checked;
	}
}
function del() {
	document.forms[0].action = "<c:url value='/usuarios/delete'/>";
	document.forms[0].submit();	
}
</script>