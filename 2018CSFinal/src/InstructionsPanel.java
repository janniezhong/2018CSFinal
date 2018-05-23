import processing.core.PApplet;
import processing.core.PImage;

/**
 * A class representing the instructions screen.
 * @author arleenliu
 * @version 5/9/18
 */
public class InstructionsPanel {
	private PImage editable;

	public void draw(PApplet drawer) {
		editable = drawer.loadImage("InstructionPanel.jpg");
		editable.resize(drawer.width,drawer.height);
		
		drawer.background(255);
		drawer.image(editable, 0f, 0f);
	}
	
}
