package buildable;

import java.util.ArrayList;

/**
 * 
 * This class models a Plaza structure, which consists of entertainment and other leisurely activities, to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class Plaza extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Plaza() {
		super("plaza.jpg", 10);
		super.setRevenue(4);
		super.setHappiness(2);
		super.setCost(30);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
