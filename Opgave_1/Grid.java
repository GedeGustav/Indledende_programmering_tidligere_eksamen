package Opgave_1;

public class Grid {
    private int size;
    private Obs[][] matrix;

    public Grid(int size) {
        this.size = size;
        this.matrix = new Obs[size][size];
    }

    public void setCell(int x, int y, Obs obs){
        if (x >= 0 && x < size && y >= 0 && y < size) {
            matrix[x][y] = obs;
        }
    }

    public void printValues() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (matrix[i][j] == null){
                    System.out.print(".");
                } else {
                    System.out.print(matrix[i][j].getValue());
                }
            }
            System.out.println();
        }
    }
}
