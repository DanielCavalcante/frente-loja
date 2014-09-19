package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import br.com.models.Perfil;
import br.com.utils.GenericController;

@Path("/perfil")
@Controller
public class PerfisController extends GenericController {

	@Path("")
	public void index() {
		Perfil p = new Perfil();
		p.setPerfilPhoto("Foto");
		p.setCoverPhoto("Cover");
		p.setBtUpdateInfo("Update Info");
		p.setViewAcitvityLog("View Activity Log");
		p.setTimeline("Timeline");
		p.setAbout("About");
		p.setPhotos("Photos");
		p.setFriends("Friends");
		p.setMore("More");
		
		p.setStatus("Status");
		p.setPhotovideo("Photo/Video");
		p.setLifeEvent("Life event");
		p.setPost("Postagem...");
		
		result.use(Results.xml()).from(p).serialize();
	}
	
}
