<form>
<a href="<c:url value='/clientes/cadastro' />" class="btn btn-success"><fmt:message key="button.cadastro" /></a>
<a href="javascript:void(0)" onclick="del()" class="btn btn-danger"><fmt:message key="button.excluir" /></a>

<a href="<c:url value='/clientes/json' />" class="btn btn-info pull-right">
	<span class="glyphicon glyphicon-export" aria-hidden="true"></span> <fmt:message key="button.jsonAll" />
</a>

<table id="clientes" class="table table-hover clientes table-condensed" cellspacing="0" width="100%">
        <thead>
            <tr>
				<th style="width: 20px;">
					<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
				</th>
				<th><fmt:message key="cliente.id" /></th>
				<th><fmt:message key="cliente.nome" /></th>
				<th><fmt:message key="cliente.cpf" /></th>
				<th><fmt:message key="cliente.email" /></th>
				<th><fmt:message key="cliente.telefone" /></th>
				<th><fmt:message key="cliente.tipo.pessoa" /></th>
				<th></th>
				<th></th>
			</tr>
        </thead>
 
        <tfoot>
            <tr>
                <th style="width: 20px;">
					<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
				</th>
				<th><fmt:message key="cliente.id" /></th>
				<th><fmt:message key="cliente.nome" /></th>
				<th><fmt:message key="cliente.cpf" /></th>
				<th><fmt:message key="cliente.email" /></th>
				<th><fmt:message key="cliente.telefone" /></th>
				<th><fmt:message key="cliente.tipo.pessoa" /></th>
				<th></th>
				<th></th>
            </tr>
        </tfoot>
 
        <tbody>
            <c:forEach items="${clienteList}" var="c">
				<tr>
					<td><input type="checkbox" value="${c.id}" name="id"></td>
					<td>${c.id}</td>
					<td>${c.nome}</td>
					<td>${c.cpf}</td>
					<td>${c.email}</td>
					<td>${c.telefone}</td>
					<td>${c.tipoPessoa}</td>
					<td>
						<a href="<c:url value='/clientes/json/${c.id}'  />" class="btn btn-info btn-xs">
							<span class="glyphicon glyphicon-export" aria-hidden="true"></span> <fmt:message key="button.json" />
						</a>
					</td>
					<td>
						<a href="<c:url value='/clientes/edit/${c.id}'  />" class="btn btn-warning btn-xs">
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
	document.forms[0].action = "<c:url value='/clientes/delete'/>";
	document.forms[0].submit();	
}
</script>