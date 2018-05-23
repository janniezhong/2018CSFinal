package buildable;

import java.util.ArrayList;

/**
 * 
 * This class models a General Store building to be placed in the city, which supposedly sells all non-food related necessities and luxuries.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class GeneralStore extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GeneralStore() {
		super("generalstore.jpg", 13);
		super.setRevenue(2);
		super.setHappiness(3);
		super.setCost(25);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}


}
