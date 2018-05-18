package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Plaza extends Building{

	public Plaza(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(4);
		super.setRevenue(4);
		super.setHappiness(2);

	}
}
