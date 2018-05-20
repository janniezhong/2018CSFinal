package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GroceryStore extends Building{

	public GroceryStore(String buildingImg, int xLoc, int yLoc) {
		super("grocerystore.jpg", xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(1);
		super.setHappiness(3);

	}
	
}
