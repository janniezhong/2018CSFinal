import java.util.ArrayList;

import buildable.Building;

/**
 * A class representing the city and the buildings within the city itself. Checks to change revenue from each of the buildings based on their location.
 * @author arleenliu
 * @version 5/22/18
 */
public class City {

	private int scenario;
	Building[][] grid;
	private int netRevenue;
	private int netHappiness;
	private int rem;

	public City(int size, int whichScene) {
		scenario = whichScene;
		grid = new Building[size][size];
		netRevenue = 100;
		netHappiness = 0;
		rem = 0;
	}
	/**
	 * Adds a building to the grid in the specified x, y location
	 * @param b Building to add to the city
	 * @param xGrid x-location in the grid to place city
	 * @param yGrid y-location in the grid to place city
	 * @return whether the building was successfully placed
	 * @post may add a building to the city
	 */
	public boolean addBuilding(Building b, int xGrid, int yGrid) {
		if (grid[yGrid][xGrid] == null) {
			grid[yGrid][xGrid] = b;

			checkSurroundings(b, yGrid, xGrid);

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Changes the current total amount of money
	 * @param amount amount to change the total amount of money by
	 */
	public void changeRevenue(int amount) {
		netRevenue += amount;
	}

	/**
	 * Updates the rate of revenue increase for the city based on buildings and their locations
	 * @post may change the amount of revenue a building makes based on its surroundings
	 */
	public void calcRevenue() {
		int prevHappiness = netHappiness;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] != null) {
					netRevenue += grid[i][j].getRevenue();
					netHappiness += grid[i][j].getHappiness();
				}
			}
		}

		int stage = (netHappiness + rem - prevHappiness) / 50;
		rem = (netHappiness + rem - prevHappiness) % 50;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] != null) {
					grid[i][j].changeRevBy(stage);
				}
			}
		}

	}

	private void checkSurroundings(Building b, int y, int x) {
		if (b.getID() == 1) { // bank

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 4
								|| grid[y + i][x + j].getID() == 8) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 5 || grid[y + i][x + j].getID() == 13
								|| grid[y + i][x + j].getID() == 10) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 2) { // factory

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 11 || grid[y + i][x + j].getID() == 3) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 7 || grid[y + i][x + j].getID() == 9
								|| grid[y + i][x + j].getID() == 4 || grid[y + i][x + j].getID() == 12) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 3) { // gas station

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 4
								|| grid[y + i][x + j].getID() == 13 || grid[y + i][x + j].getID() == 12
								|| grid[y + i][x + j].getID() == 8) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 9 || grid[y + i][x + j].getID() == 11) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 4) { // gov building

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 7 || grid[y + i][x + j].getID() == 10) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 12 || grid[y + i][x + j].getID() == 2
								|| grid[y + i][x + j].getID() == 11 || grid[y + i][x + j].getID() == 9) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 5) { // grocery store

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 1 || grid[y + i][x + j].getID() == 8
								|| grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 13) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 6 || grid[y + i][x + j].getID() == 10) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 6) { // hospital

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 12 || grid[y + i][x + j].getID() == 2) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 10 || grid[y + i][x + j].getID() == 5
								|| grid[y + i][x + j].getID() == 13 || grid[y + i][x + j].getID() == 7) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 7) { // library

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 12 || grid[y + i][x + j].getID() == 4
								|| grid[y + i][x + j].getID() == 10 || grid[y + i][x + j].getID() == 8) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 4 || grid[y + i][x + j].getID() == 2
								|| grid[y + i][x + j].getID() == 6) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 8) { // neighborhood

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 12 || grid[y + i][x + j].getID() == 9) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 11
								|| grid[y + i][x + j].getID() == 4) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 9) { // park

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 8 || grid[y + i][x + j].getID() == 12
								|| grid[y + i][x + j].getID() == 7) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 3 || grid[y + i][x + j].getID() == 2
								|| grid[y + i][x + j].getID() == 11 || grid[y + i][x + j].getID() == 4
								|| grid[y + i][x + j].getID() == 13) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 10) { // plaza

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 1 || grid[y + i][x + j].getID() == 7
								|| grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 12
								|| grid[y + i][x + j].getID() == 4 || grid[y + i][x + j].getID() == 13
								|| grid[y + i][x + j].getID() == 8) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 5 || grid[y + i][x + j].getID() == 6) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 11) { // powerplant

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 3) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 9 || grid[y + i][x + j].getID() == 12
								|| grid[y + i][x + j].getID() == 8) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 12) { // school

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 10 || grid[y + i][x + j].getID() == 7
								|| grid[y + i][x + j].getID() == 8 || grid[y + i][x + j].getID() == 9) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 4
								|| grid[y + i][x + j].getID() == 11) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		} else if (b.getID() == 13) { // general store

			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					if (y + i >= 0 && x + j >= 0 && y + i < grid.length && x + j < grid[0].length && !(i == 0 && j == 0)
							&& grid[y + i][x + j] != null) {
						if (grid[y + i][x + j].getID() == 1 || grid[y + i][x + j].getID() == 12
								|| grid[y + i][x + j].getID() == 2 || grid[y + i][x + j].getID() == 3
								|| grid[y + i][x + j].getID() == 10) {
							b.changeRevBy(1);
						} else if (grid[y + i][x + j].getID() == 7 || grid[y + i][x + j].getID() == 9
								|| grid[y + i][x + j].getID() == 6) {
							b.changeRevBy(-1);
						}
					}
				}
			}

		}
	}

	public Building[][] getCity() {
		return grid;
	}

	public int getRevenue() {
		return netRevenue;
	}

	public int getHappiness() {
		return netHappiness;
	}
}
