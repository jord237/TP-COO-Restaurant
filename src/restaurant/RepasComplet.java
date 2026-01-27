package restaurant;

public class RepasComplet implements Article  {
	private String nom;
	private String entree;
	String platPrincipal;
	String dessert;
	int prix;
	
public RepasComplet(String nom,int prix,String entree,String platPrincipal,String dessert) {
	
	this.nom=nom;
	this.prix=prix;
	this.entree = entree;
	this.platPrincipal =platPrincipal;
	this.dessert = dessert;
	
		
	}


	@Override
	public String toString() {
		return  nom + " ( "+ entree + " + "+ platPrincipal + " + "+ dessert + " + " +prix + "Euro"; 
	}


	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
