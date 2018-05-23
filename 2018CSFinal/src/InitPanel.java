import processing.core.PApplet;
import processing.core.PImage;

/**
 * A class representing the initialization screen.
 * @author arleenliu
 * @version 5/11/18
 */
public class InitPanel {
	private PImage editable;
	
	
	public void draw(PApplet drawer) {
		editable = drawer.loadImage("InitPanel.jpg");
		editable.resize(drawer.width,drawer.height);
		
		drawer.image(editable, 0, 0);
		
	}
	
}
