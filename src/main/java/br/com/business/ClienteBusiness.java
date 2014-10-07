package br.com.business;

import br.com.models.Cliente;
import br.com.repositories.ClienteRepository;
import br.com.utils.GenericBusiness;

public class ClienteBusiness extends GenericBusiness<Cliente> implements ClienteRepository {

	public ClienteBusiness() {
		super();
	}
	
}
