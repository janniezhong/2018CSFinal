import processing.core.PApplet;
import processing.core.PImage;

import java.awt.Rectangle;

import buildable.*;

/**
 * 
 * @author jzhong672
 * @version 5/17/18
 */

// may have a bug from the buildingTypes because when you pass in new buildings
// you arent creating a new instance of it, instead you're passing in the same
// object over and over again. To avoid, use the ID numbers assigned to the
// buildings instead.
public class ShopPanel {
	private PImage editable;
	private Building[] buildingTypes = {new Bank(), new Factory(), new GasStation(), 
			new GovBuilding(), new GroceryStore(), new Hospital(), new Library(), new Neighborhood(),
			new Park(), new Plaza(), new PowerPlant(), new School(), new GeneralStore()};
	private Rectangle[] buildingLoc = new Rectangle[buildingTypes.length];

	public void draw(PApplet drawer) {
		editable = drawer.loadImage("ShopPanel.jpg");
		editable.resize(drawer.width, drawer.height);

		drawer.image(editable, 0, 0);

		int horiz = (int) (drawer.width * 3.0 / 20);
		int vert = (int) (drawer.height * 7.0 / 24);
		for (int i = 0; i < buildingTypes.length; i++) {

			if (horiz > drawer.width * 8.5 / 10) {
				vert += drawer.height / 7;
				horiz = (int) (drawer.width * 3.0 / 20);
			}

			PImage editable = buildingTypes[i].getImage(drawer);
			editable.resize(drawer.width / 10, drawer.height / 10);
			drawer.image(editable, horiz, vert);

			Rectangle a = new Rectangle(horiz, vert, drawer.width / 10, drawer.height / 10);

			buildingLoc[i] = a;

			// drawer.strokeWeight(10);
			// drawer.rect(horiz, vert, drawer.width/10, drawer.height/10);

			horiz += drawer.width * 3.0 / 10;

		}

	}

	public void highlight(int rect, PApplet drawer) {
		if (rect < buildingLoc.length && rect >= 0) {
			
			
			Rectangle y = buildingLoc[rect];
			
			Rectangle x = new Rectangle (y.x, y.y, y.width, y.height);
			drawer.strokeWeight(6);
			drawer.stroke(66, 244, 209);
			drawer.noFill();
			drawer.rect((int) x.getX(), (int) x.getY(), x.width, x.height);
		}

	}

}
