package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Factory extends Building{

	public Factory(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(3);
		super.setRevenue(7);
		super.setHappiness(-3);

	}
}
