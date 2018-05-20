package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Library extends Building{
	public Library(String buildingName, int xLoc, int yLoc) {
		super("library.gif", xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(1);
		super.setHappiness(4);

	}
}
