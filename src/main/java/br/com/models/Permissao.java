package br.com.models;

public class Permissao {
	
	private String nome;
	private boolean checked;

	public Permissao(String nome, boolean checked) {
		this.nome = nome;
		this.checked = checked;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}
