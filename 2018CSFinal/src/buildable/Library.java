package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Library extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Library(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(1);
		super.setHappiness(4);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
