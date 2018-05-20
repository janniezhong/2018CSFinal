package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GeneralStore extends Building{

	public GeneralStore(String buildingName, int xLoc, int yLoc) {
		super("generalstore.jpg", xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(2);
		super.setHappiness(3);

	}


}
