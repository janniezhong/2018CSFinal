import java.util.ArrayList;

import buildable.Building;
/**
 * 
 * @author jzhong672
 * @version 5/12/18
 */
public class City {
	
	private int scenario;
	ArrayList<Building> buildings;
	int[][] grid;

	public City(int size, int whichScene) {
		scenario = whichScene;
		buildings = new ArrayList<>();
		grid = new int[size][size];
	}
	
	
	
}
