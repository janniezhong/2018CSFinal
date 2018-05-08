import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet {

	private PImage background;
	public DrawingSurface() {
		runSketch();
	}
	
	public void setup() {
		background = loadImage("IntroPic.jpg");
	}
	
	public void draw() {
		
		background(background);   
		fill(255);
		textAlign(CENTER);
		//image(background, 0, 0);
	}
	
}
