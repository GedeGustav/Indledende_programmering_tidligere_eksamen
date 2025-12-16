package Opgave_5;

public class Quadrant {
    private int size;
    private int[][] grid;

    public Quadrant(int size) {
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        this.size = size;
        this.grid = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public static void printTrace(Delta[] spor) {
        for (Delta d : spor) {
            System.out.println(d);
        }
    }

    public void countTrace(Delta[] spor) {
        int x = 0;
        int y = 0;
        for (Delta d : spor) {
            int newX = d.newX(x);
            int newY = d.newY(y);
            if (newX < 0 || newX >= size || newY < 0 || newY >= size) {
                throw new IllegalArgumentException();
            }
            x = newX;
            y = newY;
            grid[x][y]++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
