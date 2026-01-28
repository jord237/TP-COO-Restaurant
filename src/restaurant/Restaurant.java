package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Restaurant {
	private List<Table> tables;
	private Map<Table, Reservation> tablesReservees;
	
	
	public Restaurant() {
		this.tables = new ArrayList<>();
		this.tablesReservees = new HashMap<>();
	}
	public void addTable(int capacite) {
		Table table = new Table(capacite);
		tables.add(table);
	}
	
	public boolean tableEstReservee(Table table) {
		return tablesReservees.containsKey(table);
	}
	private Table chercherTableCapaciteSuffisante(int nombrePersonnes) {

	    Table meilleureTable = null;

	    for (Table table : tables) {

	        // La table doit être libre
	        if (!tableEstReservee(table)) {

	            // La table doit avoir assez de places
	            if (table.getcapacite() >= nombrePersonnes) {

	                // Première table trouvée
	                if (meilleureTable == null) {
	                    meilleureTable = table;
	                }
	                // Ou table plus petite que la meilleure actuelle
	                else if (table.getcapacite() < meilleureTable.getcapacite()) {
	                    meilleureTable = table;
	                }
	            }
	        }
	    }

	    return meilleureTable;
	}

}

	