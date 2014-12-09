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
import br.com.utils.XStreamXml;

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
	
	@Path("/delete")
	public void delete(Long[] id) {
		try {
			if (id == null || id.length == 0) {
				inbox.message("msg.selecione.uma.opcao", "").danger();
			} else {
				for (Long i : id) {
					repository.delete(i);
				}
				inbox.message("msg.registros.excluidos", "").success();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	@Path("/xml/{id}")
	public void xml(Long id){
		Usuario usuario = null;
		if(id != null){
			usuario = repository.find(id);
			XStreamXml xsx = new XStreamXml();
			String xmlUsuario = xsx.gerarXML(usuario);
			result.include("xmlUsuario", xmlUsuario);
		}
	}
	
}
