import processing.core.PApplet;

/**
 * 
 * @author jzhong672
 *	@version 5/8/18
 */
public abstract class Building {
	private int size;
	private String imageLoc;
	
	
	
	public int getSize() {
		return size;
	}
	
	public abstract void draw(PApplet drawer);
	
	
	
}
