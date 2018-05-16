package buildable;

public class Park extends Building{
	public Park(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(4);
		super.setRevenue(-1);
		super.setHappiness(4);

	}
}
