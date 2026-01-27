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
}

	