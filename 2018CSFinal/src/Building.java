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
	
	
	
	public int getSize() {
		return size;
	}

	public String getImageName() {
		return imageLoc;
	}
	
	public abstract void draw (PApplet drawer);
	
	
	
}
