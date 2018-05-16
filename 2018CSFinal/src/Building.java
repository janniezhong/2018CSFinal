
import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 *	@version 5/8/18
 */
public abstract class Building {
	private int size;
	private String imageLoc;
	private int costToBuy;
	private int happiness;
	private int revenue;
	private int x, y;
	
	public Building (String buildingName, int xLoc, int yLoc) {
		imageLoc = buildingName;
		x = xLoc;
		y = yLoc;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public void setSize(int x) {
		size = x;
	}
	
	public void setRevenue(int x) {
		revenue = x;
	}
	
	public void setHappiness(int x) {
		happiness = x;
	}

	public String getImageName() {
		return imageLoc;
	}
	
	
//	public abstract void draw (PApplet drawer);
	
	
	
}
