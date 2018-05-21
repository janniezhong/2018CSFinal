package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Park extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Park(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(4);
		super.setRevenue(-4);
		super.setHappiness(9);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
