package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import br.com.models.FanPage;
import br.com.utils.GenericController;

@Path("/fanpage")
@Controller
public class FanpagesController extends GenericController {
	
	@Path("")
	public void index() {
		
		FanPage f = new FanPage();
		f.setTitulo("SC Corinthians Paulista");
		f.setSubTitulo("Sports Club");
		f.setAbout("Descricao");
		f.setBtLike("Like");
		f.setBtGetNotification("Get Notification");
		f.setBtFollow("Follow");
		f.setBtShare("Share");
		f.setBtAddToInterestedLists("Add to Interested Lists ...");
		
		f.setQtdLikes(100000);
		f.setApps("App1");
		f.setFotos("Picture");
		f.setListaDeCurtidasDaPagina("1000000");
		f.setListaDePosts("Post1");
		
		
		result.use(Results.json()).from(f).serialize();
	}

}
