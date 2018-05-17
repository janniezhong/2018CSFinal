package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Bank extends Building{

	public Bank(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(3);
		super.setHappiness(-1);

	}
}
