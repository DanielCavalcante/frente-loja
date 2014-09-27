package br.com.business;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.com.models.Usuario;
import br.com.repositories.UsuarioRepository;
import br.com.utils.GenericBusiness;

public class UsuarioBusiness extends GenericBusiness<Usuario> implements UsuarioRepository   {

	public UsuarioBusiness() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		Criteria c = createCriteria(Usuario.class);
		c.addOrder(Order.asc("nome"));
		return c.list();
	}
	
}
