package br.com.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.utils.AbstractEntity;

@Entity(name = "cliente")
public class Cliente extends AbstractEntity {

	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cpf;
	private String email;
	private String telefone;
	@Column(name = "tipo_pessoa")
	private String tipoPessoa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

}
