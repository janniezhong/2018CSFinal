package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Factory extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Factory() {
		super("factory.gif");
		super.setSize(3);
		super.setRevenue(7);
		super.setHappiness(-3);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
