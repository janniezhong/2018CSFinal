package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GovBuilding extends Building{

	public GovBuilding(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(4);
		super.setHappiness(-6);

	}
	
	public void setRevenue (int cityNum) {
		
		
		//super.setRevenue(x);
		
	}
}
