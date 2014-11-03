package br.com.repositories;

import br.com.models.Usuario;

public interface LoginRepository {

	Usuario autenticar(String login, String senha) throws Exception;
	
}
