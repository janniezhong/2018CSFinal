package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class TouristShop extends Building{

	public TouristShop(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(1);
		super.setRevenue(3);
		super.setHappiness(1);

	}


}
