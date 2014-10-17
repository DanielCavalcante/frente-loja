package br.com.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.view.Results;
import br.com.models.Categoria;
import br.com.repositories.CategoriaRepository;
import br.com.utils.GenericController;

@Controller
@Path("/categorias")
public class CategoriasController extends GenericController {
	
	@Inject private CategoriaRepository repository;
	
	@Get("/cadastro")
	public void cadastro() {
		List<Categoria> list = (List<Categoria>) repository.list();
		result.include("listCategorias", list);
	}
	
	@Post("/save")
	public void save(Categoria categoria) {
		try {
			categoria = repository.save(categoria);
			result.use(Results.json()).from(categoria).serialize();
		} catch (Exception e) {
			e.printStackTrace();
			result.use(Results.nothing());
		}
	}
	
	@Post("/delete")
	public void delete(Long id) {
		try {
			repository.delete(id);
			result.use(Results.status()).ok();
		} catch (Exception e) {
			e.printStackTrace();
			result.use(Results.status()).badRequest("");
		}
	}

}
