

import processing.core.PApplet;
import processing.core.PImage;
/**
 * A class representing the lose screen.
 * @author jzhong672
 * @version 5/22/18
 */
public class LosePanel {

	public void draw(PApplet drawer) {
		drawer.background(255);
		drawer.stroke(0);
		PImage editable = drawer.loadImage("LosePanel.jpg");
		editable.resize(drawer.width, drawer.height);
		drawer.image(editable, 0, 0);
	}
}
