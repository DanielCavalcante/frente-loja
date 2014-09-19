package br.com.business;

import br.com.models.Usuario;
import br.com.repositories.UsuarioRepository;
import br.com.utils.GenericBusiness;

public class UsuarioBusiness extends GenericBusiness<Usuario> implements UsuarioRepository   {

	public UsuarioBusiness() {
		super();
	}
	
}
