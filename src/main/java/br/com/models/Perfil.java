package br.com.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.utils.AbstractEntity;

@Entity
@Table(name = "")
public class Perfil extends AbstractEntity {
	
	private String nome;
	private String permissoes;
	
	public void setListaPermissoes(List<String> permissoes) {
		String s = "";
		for (String p : permissoes) {
			s += "," + p;
		}
		this.permissoes = s.substring(1);
	}
	
//	public List<Permissao> getListaPermissoes() {
//		List<Permissao> lista = new ArrayList<Permissao>();
//		List<String> listaPermissoes = new ArrayList<String>();
//		if (this.permissoes != null) {
//			if (this.permissoes.contains(",")){
//				listaPermissoes = Arrays.asList(this.permissoes.split(","));
//			} else {
//				listaPermissoes.add(this.permissoes);
//			}
//		}
//		for (com.util.enums.Permissao p : com.util.enums.Permissao.values()) {
//			lista.add(new Permissao(p.name(), listaPermissoes.contains(p.name())));
//		}
//		return lista;
//	}
	
	

}
