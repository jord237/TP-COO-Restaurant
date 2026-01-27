package restaurant;

public class Table {
	private static int nombreTotalTables=0;
	private int id;
	private int capacite;
	
	
	public Table (int capacite) {
		this.capacite=capacite;
		nombreTotalTables++;
		this.id = nombreTotalTables;
		
	}
	public int getcapacite() {
		return capacite;
	}
	
	
	@Override
	public String toString() {
		return "Table "+ this.id+ " ( "+this.capacite+")";
	}
}
