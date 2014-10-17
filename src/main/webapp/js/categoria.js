function saveCategoria() {
	
	var categoria = {
		'categoria.id' : document.getElementById('idCategoria').value,
		'categoria.nome' : document.getElementById('nome').value,
		'categoria.descricao' : document.getElementById('descricao').value
	};
	
	$.post("http://localhost:8080/frente-loja/categorias/save", categoria, function(result) {
		if (result) {
			var categoria = result.categoria;
			var conteudo = "<td>"+ categoria.id +"</td>";
			conteudo += "<td>"+categoria.nome+"</td>";
			conteudo += "<td>"+categoria.descricao+"</td>";
			conteudo += "<td><a onclick='del("+categoria.id+")'>Excluir</a></td>";
			
			var linha = "<tr id='registro_"+categoria.id+"'>"+ conteudo + "</tr>";
			$('#tabela').append(linha);
		} else {
			alert('deu merda');
		}
	});
}

function del(id) {
	$.post("http://localhost:8080/frente-loja/categorias/delete?id="+id)
	.success(function(){
		$('#registro_'+id).remove();
	})
	.error(function(){
		alert('Operação não realizada');
	});
}
