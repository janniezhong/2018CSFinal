package buildable;

import java.util.ArrayList;

/**
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class School extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public School() {
		super("school.jpg", 12);
		super.setRevenue(-2);
		super.setHappiness(7);
		super.setCost(25);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
