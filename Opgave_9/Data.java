package Opgave_9;

public class Data {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int n;

    public Data(int x, int y, int n, boolean t) {
        this.x = x > 0 ? x : 0;
        this.y = y > 0 ? y : 0;
        this.n = n > 1 || n < 10 ? n : 0;

        this.dx = t ? 0 : 1;
        this.dy = t ? 1 : 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getDX() {
        return this.dx;
    }

    public int getDY() {
        return this.dy;
    }

    public int getN() {
        return this.n;
    }
}
