package Opgave_9;

public class Grid {
    private int[][] grid;

    public Grid(int size) {
        this.grid = new int[size > 0 ? size : 1][size > 0 ? size : 1];
    }

    public void line(Data data) {
        int x = data.getX();
        int y = data.getY();
        int dx = data.getDX();
        int dy = data.getDY();
        int n = data.getN();
        int size = this.grid.length;
        for (int i = 0; i < n; i++) {
            int cx = x + i * dx;
            int cy = y + i * dy;
            if (cx >= 0 && cx < size && cy >= 0 && cy < size) {
                this.grid[cy][cx] = n;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.grid.length - 1; i > -1; i--) {
            sb.append("+");
            for (int j = 0; j < this.grid[i].length; j++) {
                sb.append(this.grid[i][j]);
            }
            sb.append(" +\n");
        }
        return sb.toString();
    }

}
