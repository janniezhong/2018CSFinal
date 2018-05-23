package buildable;

import java.util.ArrayList;

/**
 * 
 * @author arleenliu
 * @version 5/22/18
 */
public class GroceryStore extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GroceryStore() {
		super("grocerystore.jpg", 5);
		super.setRevenue(1);
		super.setHappiness(3);
		super.setCost(20);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
	
}
