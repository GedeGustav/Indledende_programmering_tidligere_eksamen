package Testeksamen_1.Opgave_3;

public class Main {
    public static void main(String[] args) {
        Grid g = new Grid(10);
        System.out.println("++++++++++");
        Data a = new Data('A', 8);
        Data b = new Data('B', 7);
        Data c = new Data('C', 5);
        Data d = new Data('D', 4);
        Data e = new Data('E', 9);
        Data[] p = { a, b, c, d, e, e, e };
        g.draw(p);
        System.out.print(g);
        System.out.println("++++++++++");
    }
}
