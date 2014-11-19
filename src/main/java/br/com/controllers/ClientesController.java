package br.com.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.models.Cliente;
import br.com.repositories.ClienteRepository;
import br.com.utils.GenericController;
import br.com.utils.TipoPessoa;

@Controller
@Path("/clientes")
public class ClientesController extends GenericController {
	
	@Inject private ClienteRepository repository;
	
	@Get("/cadastro")
	public void cadastro() {
		setDados();
	}

	@Post("/save")
	public void save(Cliente cliente) {
		try {
			cliente = repository.save(cliente);
			inbox.message("msg.adiciona.sucesso", "msg.adiciona.sucesso").success();
			result.redirectTo(this).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Get("")
	public List<Cliente> list() {
		List<Cliente> list = (List<Cliente>) repository.list();
		inbox.listaVazia(list);
		result.include("clienteList", list);
		return list;
	}
	
	@Path("/delete")
	public void delete(Long[] id) {
		try {
			if (id == null || id.length == 0) {
				inbox.message("Selecione pelo menos uma opcao", "").danger();
			} else {
				for (Long i : id) {
					repository.delete(i);
				}
				inbox.message("Registro(s) excluidos com sucesso", "").success();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.redirectTo(this).list();
	}
	
	@Path("/edit/{id}")
	public void edit(Long id) {
		Cliente cliente = null;
		if (id!= null) {
			cliente = repository.find(id);
			result.include("cliente", cliente);
			setDados();
		}
	}

	private void setDados() {
		result.include("tipoPessoa", TipoPessoa.values());
	}
}
