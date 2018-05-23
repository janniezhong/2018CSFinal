package buildable;

import java.util.ArrayList;

/**
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class Library extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Library() {
		super("library.gif", 7);
		super.setRevenue(1);
		super.setHappiness(4);
		super.setCost(25);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
