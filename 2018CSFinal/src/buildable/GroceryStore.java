package buildable;
public class GroceryStore extends Building{

	public GroceryStore(String buildingImg, int xLoc, int yLoc) {
		super(buildingImg, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(3);
		super.setHappiness(2);

	}
	
}
