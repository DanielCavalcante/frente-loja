package br.com.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.models.Perfil;
import br.com.repositories.PerfilRepository;
import br.com.utils.GenericController;

@Controller
@Path("/perfis")
public class PerfisController extends GenericController {
	
	@Inject private PerfilRepository repository;
	
	@Get("")
	public List<Perfil> list() {
		List<Perfil> list = (List<Perfil>) repository.list();
		inbox.listaVazia(list);
		result.include("perfilList", list);
		return list;
	}
	
	@Get("/cadastro")
	public void cadastro() {
		result.include("permissaoList", new Perfil().getListaPermissoes());
	}
	
	@Post("/save")
	public void save(Perfil perfil, List<String> listaPermissoes) {		
		perfil.setListaPermissoes(listaPermissoes);
		repository.save(perfil);
		inbox.message("msg.save.success").success();
		result.redirectTo(this).list();
	}
	
	@Path("/edit/{id}")
	public void edit(Long id) {
		Perfil perfil = null;
		if (id != null) {
			perfil = repository.find(id);
			result.include("perfil", perfil);
		}
		result.include("permissaoList", perfil.getListaPermissoes());
	}
	
	@Path("/delete")
	public void delete(Long[] id) {
		try {
			if (id == null || id.length == 0) {
				inbox.message("msg.nenhum.registro").danger();
			} else {
				for (Long i : id) {
					repository.delete(i);
				}
				inbox.message("msg.deletado.success").success();
			}
		} catch (Exception e) {
			inbox.message("msg.erro.deletar").danger();
		}
		result.redirectTo(this).list();
	}
}
