package buildable;

import java.util.ArrayList;

/**
 * 
 * This class models a Hospital building to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class Hospital extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Hospital() {
		super("hospital.png", 6);
		super.setRevenue(1);
		super.setHappiness(6);
		super.setCost(30);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
	
}
