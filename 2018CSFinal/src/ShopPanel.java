import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 * @version 5/17/18
 */
public class ShopPanel {
	private PImage editable;
	
	
	public void draw(PApplet drawer) {
		editable = drawer.loadImage("ShopPanel.jpg");
		editable.resize(drawer.width,drawer.height);
		
		drawer.image(editable, 0, 0);
		
		
		
		
		
	}
	
}
