package br.com.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.utils.AbstractEntity;

@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity {

	private String nome;
	private String login;
	private String senha;
	@Transient
	private String confirmSenha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmSenha() {
		return confirmSenha;
	}

	public void setConfirmSenha(String confirmSenha) {
		this.confirmSenha = confirmSenha;
	}

}
