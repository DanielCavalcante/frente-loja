package br.com.utils;

import br.com.models.Cliente;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class XStreamJson {
	
	private XStream xstream;
	
	public XStreamJson(){
		this.xstream = new XStream(new JsonHierarchicalStreamDriver());
		alias();
	}
	
	public void alias(){
		this.xstream.alias("Cliente", Cliente.class);
	}
	
	public String gerarJSON(Cliente cliente){
		return this.xstream.toXML(cliente);
	}

}
