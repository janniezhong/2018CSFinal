package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GasStation extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GasStation() {
		super("gasstation.jpg");
		super.setRevenue(4);
		super.setHappiness(1);
		super.setCost(20);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
