package buildable;

import java.util.ArrayList;

/**
 * This class models a Gas Station building to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class GasStation extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GasStation() {
		super("gasstation.jpg", 3);
		super.setRevenue(4);
		super.setHappiness(1);
		super.setCost(20);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
