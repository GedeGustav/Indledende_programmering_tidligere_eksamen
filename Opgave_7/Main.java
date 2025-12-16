package Opgave_7;

public class Main {
    public static void main(String[] args) {
        Data a = new Data(1, 2, true);
        Data b = new Data(7, 4, false);
        Data c = new Data(-1, -1, true);
        Data d = new Data(9, 0, true);
        Data[] t = { a, b, c, d };
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Grid m = new Grid(10, t);
        System.out.println("0123456789");
        System.out.print(m);
        System.out.println("0123456789");
    }
}
