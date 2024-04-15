package fr.diginamic.automates;

public class JeuDeLaVie {
	public int row;
	public int column;
	public boolean[][] grid;
	
	//Pas eu le temps de terminer
	public JeuDeLaVie(int row, int column) {
		this.row = row;
		this.column = column;
		grid = new boolean[row][column];

	}

	public boolean lifeOrDie(int neighbor, boolean cell) {
		if (cell) {
			if (neighbor < 2 || neighbor >= 4) {
				return false;
			}

			return true;
		} else {
			if (neighbor == 3) {
				return true;
			}

			return false;
		}
	}

	public int countNeighbors(int x, int y) {
		int count = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int neighborX = x + i;
				int neighborY = y + j;
				if (neighborX >= 0 && neighborX < row && neighborY >= 0 && neighborY < column && !(i == 0 && j == 0)
						&& grid[neighborX][neighborY]) {
					count++;
				}
			}
		}
		return count;
	}

}
