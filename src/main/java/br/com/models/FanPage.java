package br.com.models;


public class FanPage {

	private String titulo;
	private String subTitulo;

	private String btLike;
	private String btGetNotification;
	private String btAddToInterestedLists;
	private String btFollow;
	private String btShare;

	private Integer qtdLikes;
	private String about;
	private String apps;
	private String fotos;
	private String listaDeCurtidasDaPagina;
	private String listaDePosts;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getBtLike() {
		return btLike;
	}

	public void setBtLike(String btLike) {
		this.btLike = btLike;
	}

	public String getBtGetNotification() {
		return btGetNotification;
	}

	public void setBtGetNotification(String btGetNotification) {
		this.btGetNotification = btGetNotification;
	}

	public String getBtAddToInterestedLists() {
		return btAddToInterestedLists;
	}

	public void setBtAddToInterestedLists(String btAddToInterestedLists) {
		this.btAddToInterestedLists = btAddToInterestedLists;
	}

	public String getBtFollow() {
		return btFollow;
	}

	public void setBtFollow(String btFollow) {
		this.btFollow = btFollow;
	}

	public String getBtShare() {
		return btShare;
	}

	public void setBtShare(String btShare) {
		this.btShare = btShare;
	}

	public Integer getQtdLikes() {
		return qtdLikes;
	}

	public void setQtdLikes(Integer qtdLikes) {
		this.qtdLikes = qtdLikes;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getApps() {
		return apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getListaDeCurtidasDaPagina() {
		return listaDeCurtidasDaPagina;
	}

	public void setListaDeCurtidasDaPagina(String listaDeCurtidasDaPagina) {
		this.listaDeCurtidasDaPagina = listaDeCurtidasDaPagina;
	}

	public String getListaDePosts() {
		return listaDePosts;
	}

	public void setListaDePosts(String listaDePosts) {
		this.listaDePosts = listaDePosts;
	}

}
