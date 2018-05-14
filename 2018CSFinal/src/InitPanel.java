import processing.core.PApplet;
import processing.core.PImage;

public class InitPanel {
	private PImage editable;
	
	
	public void draw(PApplet drawer) {
		editable = drawer.loadImage("InitPanel.jpg");
		editable.resize(drawer.width,drawer.height);
		
		drawer.image(editable, 0, 0);
	}
	
}
