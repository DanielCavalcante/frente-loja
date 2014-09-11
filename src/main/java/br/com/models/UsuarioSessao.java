package br.com.models;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("usuarioSessao")
public class UsuarioSessao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean sessaoValida() {
		return usuario != null && usuario.getId() != null;
	}

	public void invalidaSessao() {
		usuario = null;
	}

}
