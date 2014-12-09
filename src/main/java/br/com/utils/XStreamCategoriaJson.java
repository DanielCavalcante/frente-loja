package br.com.utils;

import br.com.models.Categoria;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class XStreamCategoriaJson {
	
	private XStream xstream;
	
	public XStreamCategoriaJson(String alias){
		this.xstream = new XStream(new JsonHierarchicalStreamDriver());
		alias(alias);
	}
	
	public void alias(String alias){
		this.xstream.alias(alias, Categoria.class);
	}
	
	public String gerarJSON(Object objeto){
		return this.xstream.toXML(objeto);
	}

}
