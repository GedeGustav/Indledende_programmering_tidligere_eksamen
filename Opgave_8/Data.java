package Opgave_8;

public class Data {
    private int x;
    private int y;
    private int n;

    public Data(int x, int y, int n) {
        this.x = x > 0 ? x : 0;
        this.y = y > 0 ? y : 0;
        this.n = n > 0 && n < 10 ? n : 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getN() {
        return this.n;
    }

    @Override
    public String toString() {
        return this.x + "," + this.y + ":" + this.n;
    }
}
