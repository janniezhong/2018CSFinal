import java.awt.Point;

import buildable.*;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author janniezhong
 * @version 5/20/18
 */
public class CityPanel {

	private PImage editable;
	private City city;
	public static int size;
	private int scenario;
	private Building[] buildingTypes = { new Bank(), new Factory(), new GasStation(), new GeneralStore(),
			new GovBuilding(), new GroceryStore(), new Hospital(), new Library(), new Neighborhood(), new Park(),
			new Plaza(), new PowerPlant(), new School() };
	
	// 1 = nuclear
	// 2 = zombie apocalypse
	// 3 = AI takeover
	// 4 = meteor crash
	// 5 = tsunami
	// 6 = sun burned out
	
	private int nextBuilding;

	public CityPanel(int scene) {
		size = 10;
		scenario = scene;
		City c = new City(size, scene);

	}

	public void draw(PApplet drawer) {
		
		if (scenario == 1) {
			editable = drawer.loadImage("ScenarioAITakeover.jpg");
			editable.resize(drawer.width, drawer.height);
		} else if (scenario == 2) {
			editable = drawer.loadImage("ScenarioApocalypse.jpg");
			editable.resize(drawer.width, drawer.height);
		} else if (scenario == 3) {
			editable = drawer.loadImage("ScenarioAITakeover.jpg");
			editable.resize(drawer.width, drawer.height);
		} else if (scenario == 4) {
			editable = drawer.loadImage("ScenarioMeteorCrash.jpg");
			editable.resize(drawer.width, drawer.height);
		} else if (scenario == 5) {
			editable = drawer.loadImage("ScenarioTsunami.jpg");
			editable.resize(drawer.width, drawer.height);
		} else if (scenario == 6) {
			editable = drawer.loadImage("ScenarioSun.jpg");
			editable.resize(drawer.width, drawer.height);
		}
		
		drawer.image(editable, 0, 0);

		drawer.stroke(255);
		drawer.strokeWeight(2);
		for (int i = 1; i < size; i++) {
			drawer.line(0, i * (drawer.height / size), drawer.width, i * (drawer.height / size));
			drawer.line(i * (drawer.width / size), 0, i * (drawer.width / size), drawer.height);
		}
	}
	
	
	public void buildingToAdd(int i) {
		nextBuilding = i;
	}
	
	
	public boolean insertBuilding(Point p) {
		if (nextBuilding >=0) {
			city.addBuilding(buildingTypes[nextBuilding], (int)p.getX(), (int)p.getY());
			return true;
		}else {
			return false;
		}
	}
}
