package br.com.utils;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named(value="jsImportTag")
public class JsImportTag {

	private List<String> list = new ArrayList<String>();
	
	public void addJs(String js) {
		list.add(js);
	}

	public List<String> getList() {
		return list;
	}
	
}
