package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GroceryStore extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GroceryStore(String buildingImg, int xLoc, int yLoc) {
		super(buildingImg, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(1);
		super.setHappiness(3);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
	
}
