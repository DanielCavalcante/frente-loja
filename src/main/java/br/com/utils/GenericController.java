package br.com.utils;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Result;
import br.com.models.UsuarioSessao;

public abstract class GenericController {
	
	@Inject protected UsuarioSessao usuarioSessao;
	@Inject protected Result result;
	@Inject protected HttpServletRequest request;
	@Inject protected Inbox inbox;

}
