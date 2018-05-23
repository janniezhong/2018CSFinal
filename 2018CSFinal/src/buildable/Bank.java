package buildable;

import java.util.ArrayList;

/**
 * This class models a Bank building to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */

public class Bank extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Bank() {
		super("bank.png", 1);
		super.setRevenue(6);
		super.setHappiness(-2);
		super.setCost(25);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();
	}
}
