package restaurant;

public class Client {
	String nom;
	
	
	public Client(String nom) {
		this.nom=nom;
		}
	
	@Override
	public String toString() {
		return "(Son nom est :"+this.nom+")";
	}
	
}

	
