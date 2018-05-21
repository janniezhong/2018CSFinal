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
	
	public int getCost() {
		return costToBuy;
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	// increments or decrements revenue by specified stage
	public void changeRevBy(int stage) {
		revenue += stage;
	}
	
	
//	public abstract void draw (PApplet drawer);
	
	
	
}
