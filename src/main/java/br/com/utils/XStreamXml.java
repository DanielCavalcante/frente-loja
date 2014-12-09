package br.com.utils;

import br.com.models.Usuario;

import com.thoughtworks.xstream.XStream;

public class XStreamXml {
	
	private XStream xstream;
	
	public XStreamXml(String alias){
		this.xstream = new XStream();
		alias(alias);
	}
	
	public void alias(String alias){
		this.xstream.alias(alias, Usuario.class);
	}
	
	public String gerarXML(Object objeto){
		return this.xstream.toXML(objeto);
	}

}
