package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
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
