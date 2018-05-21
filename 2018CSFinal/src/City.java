import java.util.ArrayList;

import buildable.Building;
/**
 * 
 * @author jzhong672
 * @version 5/12/18
 */
public class City {
	
	private int scenario;
	Building[][] grid;

	public City(int size, int whichScene) {
		scenario = whichScene;
		grid = new Building[size][size];
	}
	
	public void addBuilding(Building b, int xGrid, int yGrid) {
		if (grid[yGrid][xGrid] != null) {
			grid[yGrid][xGrid] = b;
		}
	}
	
	
	public Building[][] getCity() {
		return grid;
	}
}
