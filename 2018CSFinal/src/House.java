import processing.core.PApplet;
import processing.core.PImage;

public class House extends Building{

	private PImage img;
	
	@Override
	public void draw(PApplet drawer) {
		// TODO Auto-generated method stub
		img = drawer.loadImage(super.getImageName());
	}

}
