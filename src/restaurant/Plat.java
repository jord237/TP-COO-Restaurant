package restaurant;

public class Plat implements Article {
	String nom;
	int prix;
	
	
	public Plat(String nom,int prix) {
	this.nom =nom;
	this.prix=prix;
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return this.nom+" : "+this.prix+ "  "+ "euro";
	}
}
