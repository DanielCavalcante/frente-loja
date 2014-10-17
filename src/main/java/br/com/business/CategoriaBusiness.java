package br.com.business;

import br.com.models.Categoria;
import br.com.repositories.CategoriaRepository;
import br.com.utils.GenericBusiness;

public class CategoriaBusiness extends GenericBusiness<Categoria> implements CategoriaRepository {
	
	public CategoriaBusiness() {
		super();
	}

}
