package br.com.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.models.Usuario;
import br.com.repositories.UsuarioRepository;
import br.com.utils.GenericController;

@Controller
@Path("/usuarios")
public class UsuariosController extends GenericController {
	
	@Inject private UsuarioRepository repository;

	@Path("")
	public List<Usuario> list() {
		List<Usuario> list = (List<Usuario>) repository.list();
		result.include("usuarioList", list);
		return list;
	}
	
	@Get("/cadastro")
	public void cadastro() {
	}
	
	@Post("/save")
	public void save(Usuario usuario) {
		usuario = repository.save(usuario);
		result.redirectTo(this).list();
	}
	
	@Path("/delete/{id}")
	public void delete(Long id) {
		repository.delete(id);
		result.redirectTo(this).list();
	}
	
	@Path("/edit/{id}")
	public void edit(Long id) {
		Usuario usuario = null;
		if (id != null) {
			usuario = repository.find(id);
			result.include("usuario", usuario);
		}
	}
	
}
