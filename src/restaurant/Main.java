package restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client("marius");
		
		System.out.println(c);
		
		Plat p = new Plat ("Riz sauté",20);
		System.out.println(p);
		RepasComplet rc = new RepasComplet(
			    "Formule déjeuner",
			    35,
			    "salade",
			    "tartare de bœuf",
			    "crème brûlée");

			System.out.println(rc);
			
			Table t1 = new Table(4);
			
			System.out.println(t1);
	}
	


}
