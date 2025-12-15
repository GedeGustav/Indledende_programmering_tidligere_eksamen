package Opgave_1;

public class Main {
    public static void main(String[] args) {
        Grid x = new Grid(5);
        x.printValues();
        System.out.println();
        System.out.println("-----");
        System.out.println();
        x.setCell(1, 1, new Obs("A", "1st comment"));
        x.setCell(2, 3, new Obs("B", "2nd comment"));
        x.setCell(4, 2, new Obs("C", "3rd comment"));
        x.printValues();
    }
}