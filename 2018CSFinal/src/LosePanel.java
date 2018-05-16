

import processing.core.PApplet;
/**
 * 
 * @author jzhong672
 * @version 5/16/18
 */
public class LosePanel {

	public void draw(PApplet drawer) {
		drawer.background(255);
		drawer.stroke(0);
		drawer.text("YOU LOSE", (float)(drawer.width *0.5), (float)(drawer.height *0.5));
		drawer.image(drawer.loadImage("shelbyface.png") /*.resize(w, h)*/, (float)(drawer.width *0.25), (float)(drawer.height *0.25));
	}
}
