package buildable;

import java.util.ArrayList;

/**
 * 
 * This class models a Government or capital building to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class GovBuilding extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GovBuilding() {
		super("govbuilding.jpg", 4);
		super.setRevenue(4);
		super.setHappiness(-6);
		super.setCost(25);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
	
	public void setRevenue (int cityNum) {
		
		
		//super.setRevenue(x);
		
	}
}
