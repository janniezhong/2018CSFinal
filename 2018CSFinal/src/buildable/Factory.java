package buildable;

import java.util.ArrayList;

/**
 * This class models a Factory building to be placed in the city.
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class Factory extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Factory() {
		super("factory.gif", 2);
		super.setRevenue(7);
		super.setHappiness(-3);
		super.setCost(30);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
