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
		result.include("tipoPessoa", TipoPessoa.values());
	}

	@Post("/save")
	public void save(Cliente cliente) {
		try {
			cliente = repository.save(cliente);
			result.redirectTo(this).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Get("")
	public List<Cliente> list() {
		List<Cliente> list = (List<Cliente>) repository.list();
		result.include("clienteList", list);
		return list;
	}
	
	@Path("/delete")
	public void delete(Long[] id) {
		try {
			if (id == null || id.length == 0) {
				//Fudeu
			} else {
				for (Long i : id) {
					repository.delete(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.redirectTo(this).list();
	}
	
}
