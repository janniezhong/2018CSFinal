package buildable;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *This class serves as the foundation and base model for any kind of specific building created to be placed in the city.
 * 
 * @author arleenliu
 *	@version 5/22/18
 */
public abstract class Building {
	private String imageLoc;
	private int costToBuy;
	private int happiness;
	private int revenue;
	private int x, y;
	private int id;
	
	public Building (String buildingName, int id) {
		imageLoc = buildingName;
		this.id = id;
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
	
	/**
	 * This method returns the cost to purchase one building of this specific type.
	 * 
	 * @return cost The amount of money required to buy one building
	 */
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
	
	public int getID() {
		return id;
	}
	
	
//	public abstract void draw (PApplet drawer);
	
	
	
}
