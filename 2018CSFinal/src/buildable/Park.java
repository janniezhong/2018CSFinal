package buildable;

import java.util.ArrayList;

/**
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class Park extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Park() {
		super("park.jpg", 9);
		super.setRevenue(-4);
		super.setHappiness(9);
		super.setCost(30);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
