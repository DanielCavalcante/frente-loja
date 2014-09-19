package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import br.com.models.TimeLine;
import br.com.utils.GenericController;

@Path("/timeline")
@Controller
public class TimeLinesController extends GenericController {

	@Path("")
	public void index() {
		TimeLine t = new TimeLine();
		t.setBarraPesquisa("Search for people, places and things");
		t.setIconePerfil("Icone1");
		t.setConversas("Icone2");
		t.setIconeAmigos("Icone3");
		
		t.setSettings("Settings");
		t.setFeedNews("Feed News");
		
		t.setMessages("Messages");
		t.setEvents("Events");
		t.setPhotos("Photos");
		
		t.setPages("SC CORINTHIANS PAULISTA");
		t.setGroups("SPI ZUERO");
		t.setApps("Tim Beta");
		
		t.setUpdateStatus("Update status");
		t.setAddPhotosVideo("Add Photos/Video");
		t.setStatus("What's on your mind?");
		
		t.setPosts("Propagando sobre Politicas");
		t.setChat("100 pessoas on");
		t.setPropagandas("Propaganda bagarai");
		
		result.use(Results.xml()).from(t).serialize();
	}
	
}
