package buildable;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author jzhong672
 * @version 5/11/18
 * 
 */
public class Neighborhood extends Building{

	private PImage img;
	
	//should pass "house" into the constructor
	public Neighborhood(int xLoc, int yLoc) {
		super("neighborhood.png", xLoc, yLoc);
		super.setSize(3);
		super.setRevenue(-1);
		super.setHappiness(4);
	}
	
//	@Override
//	public void draw(PApplet drawer) {
//		// TODO Auto-generated method stub
//		img = drawer.loadImage(super.getImageName());
//		img.resize(drawer.width/8, drawer.height/8);
//		
//		drawer.image(img, (float)(drawer.width *0.25), (float)(drawer.height *0.25));
//		
//	}

}
