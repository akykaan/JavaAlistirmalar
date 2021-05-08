package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String ad;
	private String soyad;
	private String ePosta;
	private String parola;
	
	
	public User(int id, String ad, String soyad, String ePosta, String parola) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.ePosta = ePosta;
		this.parola = parola;
	}


	public int getId() {
		return id;
	}


	
	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getePosta() {
		return ePosta;
	}


	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}

	
}
