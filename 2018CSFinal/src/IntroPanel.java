import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 * @version 5/8/18
 */

public class IntroPanel {
	private PImage editable;

	public void draw(PApplet drawer) {
		editable = drawer.loadImage("IntroPic.jpg");
		editable.resize(drawer.width,drawer.height); 
		//background(editable);   
		drawer.noFill();
		drawer.textAlign(drawer.CENTER);
		drawer.image(editable, 0, 0);
	}
	
}
