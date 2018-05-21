package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class PowerPlant extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public PowerPlant() {
		super("powerplant.jpg");
		super.setRevenue(8);
		super.setHappiness(-4);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}