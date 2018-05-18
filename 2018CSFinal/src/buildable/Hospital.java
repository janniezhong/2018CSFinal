package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Hospital extends Building{
	
	public Hospital(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(3);
		super.setRevenue(1);
		super.setHappiness(6);

	}
	
}
