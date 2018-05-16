package buildable;

public class Library extends Building{
	public Library(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(1);
		super.setHappiness(2);

	}
}
