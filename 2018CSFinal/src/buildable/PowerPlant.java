package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class PowerPlant extends Building{

	public PowerPlant(String buildingName, int xLoc, int yLoc) {
		super("powerplant.ipg", xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(8);
		super.setHappiness(-4);

	}
}
