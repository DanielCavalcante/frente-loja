package br.com.utils;

import br.com.models.Usuario;

import com.thoughtworks.xstream.XStream;

public class XStreamXml {
	
	private XStream xstream;
	
	public XStreamXml(){
		this.xstream = new XStream();
		alias();
	}
	
	public void alias(){
		this.xstream.alias("Usuario", Usuario.class);
	}
	
	public String gerarXML(Usuario usuario){
		return this.xstream.toXML(usuario);
	}

}
