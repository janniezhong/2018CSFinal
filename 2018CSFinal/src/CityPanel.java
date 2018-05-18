import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author arleenliu
 * @version 5/11/18
 */
public class CityPanel {

	private PImage editable;
	private City city;
	private int size;
	private int scenario;

	public CityPanel(int scene) {
		size = 10;
		scenario = scene;

	}

	public void draw(PApplet drawer) {
		editable = drawer.loadImage("cityBackground.jpg");
		editable.resize(drawer.width, drawer.height);

		drawer.image(editable, 0, 0);

		drawer.stroke(255);
		drawer.strokeWeight(2);
		for (int i = 1; i < size; i++) {
			drawer.line(0, i * (drawer.height / size), drawer.width, i * (drawer.height / size));
			drawer.line(i * (drawer.width / size), 0, i * (drawer.width / size), drawer.height);
		}
	}
}
