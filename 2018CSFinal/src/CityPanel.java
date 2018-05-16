import processing.core.PApplet;
import processing.core.PImage;

public class CityPanel {
	
	private PImage editable;
	private City city;
	private int size;

	public CityPanel() {
		size = 20;
		
	}
	
	public void draw(PApplet drawer) {
		editable = drawer.loadImage("cityBackground.jpg");
	editable.resize(drawer.width,drawer.height);
	
	drawer.image(editable, 0, 0);
	
	drawer.stroke(255);
	drawer.strokeWeight(2);
	for (int i = 1; i < size; i++) {
		drawer.line(0, i * (drawer.height / size), drawer.width, i * (drawer.height / size));
		drawer.line(i * (drawer.width / size), 0, i * (drawer.width / size), drawer.height);
	}
	}
}
