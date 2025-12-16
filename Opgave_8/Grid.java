package Opgave_8;

public class Grid {
    private int[][] grid;

    public Grid(int xsize, int ysize, Data[] data) {
        this.grid = new int[xsize][ysize];
        for (Data d : data) {
            int x = d.getX();
            int y = d.getY();
            if (x < xsize && y < ysize) {
                this.grid[y][x] = d.getN();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.grid.length - 1; i >= 0; i--) {
            for (int j = 0; j < this.grid[i].length; j++) {
                sb.append(this.grid[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
