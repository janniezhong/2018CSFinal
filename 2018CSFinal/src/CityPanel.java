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
	private String name;
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

	public CityPanel(int scene, String name) {
		size = 10;
		scenario = scene;
		city = new City(size, scene);
		this.name = name;

	}

	public void draw(PApplet drawer) {
		
		if (scenario == 1) {
			editable = drawer.loadImage("ScenarioNuclear.jpg");
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
		
		drawer.pushStyle();
		drawer.fill(234);
		drawer.rect(5, 5, 150, 20);
		drawer.rect(200, 5, 150, 20);
		drawer.rect(drawer.width - 205, 5, 200, 20);
		
		drawer.fill(0);
		drawer.strokeWeight(2);
		drawer.textSize(15); 
		drawer.text("Revenue:     " + city.getRevenue(), 80, 20);
		drawer.text("Happiness:     " + city.getHappiness(), 275, 20);
		drawer.text(name, drawer.width - 102, 20);
		drawer.popStyle();
	}
	
	
	public void buildingToAdd(int i) {
		nextBuilding = i;
	}
	
	
	public boolean insertBuilding(Point p) {
		
		if (p != null && nextBuilding >= 0 && buildingTypes[nextBuilding] != null) {
			return city.addBuilding(buildingTypes[nextBuilding], (int)p.getX(), (int)p.getY());
		} else {
			return false;
		}
	}
	
}
