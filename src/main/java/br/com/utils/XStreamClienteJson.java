package br.com.utils;

import br.com.models.Cliente;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class XStreamClienteJson {
	
	private XStream xstream;
	
	public XStreamClienteJson(String alias){
		this.xstream = new XStream(new JsonHierarchicalStreamDriver());
		alias(alias);
	}
	
	public void alias(String alias){
		this.xstream.alias(alias, Cliente.class);
	}
	
	public String gerarJSON(Object objeto){
		return this.xstream.toXML(objeto);
	}

}
