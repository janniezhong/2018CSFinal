package buildable;

import java.util.ArrayList;

/**
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class PowerPlant extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public PowerPlant() {
		super("powerplant.jpg", 11);
		super.setRevenue(3);
		super.setHappiness(5);
		super.setCost(30);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
