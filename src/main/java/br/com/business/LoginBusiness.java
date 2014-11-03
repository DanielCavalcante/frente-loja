package br.com.business;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.models.Usuario;
import br.com.repositories.LoginRepository;

public class LoginBusiness implements LoginRepository {

	@Inject private EntityManager manager;

	public Usuario autenticar(String login, String senha) {
		
		Usuario usuario = search(login, senha);
		
		if (usuario == null) {
			usuario = search(login, senha);
		}
		
		return usuario;
	}

	private Usuario search(String login, String senha) {
		try {
			return (Usuario) manager.
				createQuery("from Usuario where login = '" + login + "' and senha = '" + senha + "'").getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
