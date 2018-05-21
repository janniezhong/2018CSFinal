package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Plaza extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Plaza() {
		super("plaza.jpg");
		super.setSize(4);
		super.setRevenue(4);
		super.setHappiness(2);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
