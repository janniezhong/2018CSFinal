package buildable;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 *	@version 5/15/18
 */
public abstract class Building {
	private String imageLoc;
	private int costToBuy;
	private int happiness;
	private int revenue;
	private int x, y;
	
	public Building (String buildingName) {
		imageLoc = buildingName;
	}
	
	
	public void setRevenue(int x) {
		revenue = x;
	}
	
	public void setCost(int x) {
		costToBuy = x;
	}
	
	public void setHappiness(int x) {
		happiness = x;
	}

	public PImage getImage(PApplet drawer) {
		return drawer.loadImage(imageLoc);
	}
	
	
//	public abstract void draw (PApplet drawer);
	
	
	
}
