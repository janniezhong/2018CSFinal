package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */

public class Bank extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Bank(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(6);
		super.setHappiness(-2);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();
	}
}
