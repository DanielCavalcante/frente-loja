package br.com.controllers;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.models.Usuario;
import br.com.utils.GenericController;

@Controller
@Path("/usuarios")
public class UsuariosController extends GenericController {

	@Get("")
	public List<Usuario> list() {
		return null;
	}
	
	@Get("/cadastro")
	public void cadastro() {
	}
	
	@Post("/save")
	public void save(Usuario usuario) {
		
	}
	
}
