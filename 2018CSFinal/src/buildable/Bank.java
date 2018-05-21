package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */

public class Bank extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public Bank() {
		super("bank.png");
		super.setRevenue(6);
		super.setHappiness(-2);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();
	}
}
