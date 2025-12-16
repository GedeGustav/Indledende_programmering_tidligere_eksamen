package Opgave_5;

public class Delta {
    private int a;
    private int b;

    public Delta(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int newX(int x) {
        return this.a + x;
    }

    public int newY(int y) {
        return this.b + y;
    }

    @Override
    public String toString() {
        return "" + a + ":" + b;
    }
}
