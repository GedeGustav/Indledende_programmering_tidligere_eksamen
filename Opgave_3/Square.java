package Opgave_3;

public class Square {
    private int size;
    private Cell[][] matrix;

    public Square(int size, String name) {
        if (size < 1){
            throw new IllegalArgumentException("must be a positive integer");
        }
        this.size = size;
        this.matrix = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = new Cell(name);
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.size; i++){
            for (int j = 0; j < this.size; j++){
                System.out.print(matrix[i][j].result());
            }
            System.out.println();
        }
    }

    public void cross() {
        for (int i = 0; i < this.size; i++){
            for (int j = 0; j < this.size; j++){
                if (i == j){
                    matrix[i][j].toggle();
                }
            }
        }
    }
}

