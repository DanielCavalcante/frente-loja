package br.com.business;

import br.com.models.Perfil;
import br.com.repositories.PerfilRepository;
import br.com.utils.GenericBusiness;

public class PerfilBusiness extends GenericBusiness<Perfil> implements
		PerfilRepository {

	public PerfilBusiness() {
		super();
	}

}
