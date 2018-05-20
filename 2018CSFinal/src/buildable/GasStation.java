package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GasStation extends Building{

	public GasStation(String buildingName, int xLoc, int yLoc) {
		super("gasstation.jpg", xLoc, yLoc);
		super.setSize(1);
		super.setRevenue(1);
		super.setHappiness(4);

	}
}
