package Testeksamen_1.Opgave_3;

public class Data {
    private char c;
    private int n;

    public Data(char c, int n) {
        this.c = c;
        this.n = n < 1 ? 1 : n;
    }

    public int getCount() {
        return n;
    }

    public String toString() {
        return "" + c;
    }
}
