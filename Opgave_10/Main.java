package Opgave_10;

public class Main {
    public static void main(String[] args) {
        char m[][] = { { 'A', 'B', 'C' }, { 'A', 'D', 'C' } };
        System.out.println("++++++++++++");
        Grid g = new Grid(m);
        System.out.println(g);
        System.out.println("++++++++++++");
        g.swap("A");
        System.out.println(g);
        System.out.println("++++++++++++");
        g.swap("E");
        System.out.println(g);
        System.out.println("++++++++++++");
        g.swap("C");
        System.out.println(g);
        System.out.println("++++++++++++");
    }
}
