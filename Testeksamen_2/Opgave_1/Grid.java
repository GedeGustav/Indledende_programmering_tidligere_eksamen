package Testeksamen_2.Opgave_1;

public class Grid {
    private char[][] grid;

    public Grid(Data[] array, int xsize, int ysize) {
        if (xsize < 0) {
            xsize = 0;
        }
        if (ysize < 0) {
            ysize = 0;
        }
        grid = new char[xsize][ysize];
        for (int x = 0; x < xsize; x++) {
            for (int y = 0; y < ysize; y++) {
                grid[x][y] = '.';
            }
        }
        for (int k = 0; k < array.length; k++) {
            if (array[k].getFlag()) {
                int x = array[k].getPosition();
                if (0 <= x && x < xsize) {
                    for (int y = 0; y < ysize; y++) {
                        grid[x][y] = array[k].getMarking();
                    }
                }
            } else {
                int y = array[k].getPosition();
                if (0 <= y && y < ysize) {
                    for (int x = 0; x < xsize; x++) {
                        grid[x][y] = array[k].getMarking();
                    }
                }
            }
        }
    }

    public void stretch() {
        for (int i = 0; i < grid.length; i++) {
            char[] t = new char[2 * grid[i].length];
            for (int j = 0; j < grid[i].length; j++) {
                t[2 * j] = grid[i][j];
                t[2 * j + 1] = grid[i][j];
            }
            grid[i] = t;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                s += grid[i][j];
            }
            s += "\n";
        }
        return s;
    }
}
