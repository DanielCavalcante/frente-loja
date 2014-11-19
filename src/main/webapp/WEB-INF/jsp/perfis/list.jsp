<form>
	<div class="form-inline">
		<div class="col-lg-3">
			<a onclick="del()" class="btn btn-danger">
				<span class="glyphicon glyphicon-remove"></span> <fmt:message key="button.delete" />
			</a>
			<a href="<c:url value='/perfis/cadastro' />" class="btn btn-success">
				<span class="glyphicon glyphicon-plus"></span> <fmt:message key="button.new" />
			</a>
		</div>
	</div>
	<c:if test="${!empty perfilList}">
		<h3><fmt:message key="perfil.lista" /></h3>
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 20px;">
						<input type="checkbox" onclick="selectAll(this, 'id')" class="checkbox">
					</th>
					<th><fmt:message key="perfil.nome" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${perfilList}" var="p">
					<tr>
						<td><input type="checkbox" value="${p.id}" name="id" class="checkbox"></td>
						<td><a href='<c:url value="/perfis/edit/${p.id}" />'>${p.nome}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</form>
<script>
function del() {
	document.forms[0].action = "<c:url value='/perfis/delete'/>";
	document.forms[0].submit();	
}
</script>