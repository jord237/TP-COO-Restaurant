package restaurant;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
	private LocalTime heureArrivee ;
	private Client client;
	private int nbPlacesReservee;
	private List<Article> articlesCommandes;
	
	
	public Reservation(LocalTime heureArrivee, Client client, int nbPlacesReservee) {
		this.heureArrivee = heureArrivee;
		this.client = client;
		this.nbPlacesReservee = nbPlacesReservee;
		 this.articlesCommandes = new ArrayList<>();
	}
	
	public void addCommande(Article article) {
		articlesCommandes.add(article);
		
	}
	
	public int montantFacture() {
		int sommeFacture=0;
		for (Article article : articlesCommandes) {
			sommeFacture = sommeFacture + article.getPrix();
		}
		return sommeFacture;
	}
	public void addCommande (Plat plat, int quantite) {
		for(int i = 0; i<quantite; i++) {
			articlesCommandes.add(plat);
		}
	}
	
	@Override
	public String toString() {

	    String resultat = "Réservation de " + client
	            + " (" + nbPlacesReservee + ", " + heureArrivee + ")\n";

	    for (Article article : articlesCommandes) {
	        resultat += article + "\n";
	    }

	    resultat += "Total : " + montantFacture() + "€";

	    return resultat;
	}

	
	
}
