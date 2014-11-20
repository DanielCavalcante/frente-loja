<form>
<a href='<c:url value='/clientes/cadastro' />' class="btn btn-success"><fmt:message key="button.cadastro" /></a>
<button onclick="del()" class="btn btn-danger"><fmt:message key="button.excluir" /></button>
<table class="table table-hover">
	<thead>
		<tr>
			<th style="width: 20px;">
				<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
			</th>
			<th>Id</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Tipo pessoa</th>
			<th></th>
		</tr>
	</thead>
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
				<td><a href="<c:url value='/clientes/edit/${c.id}' />">
					<button class="btn btn-warning btn-xs">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
					</button></a>
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