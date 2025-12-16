package Opgave_7;

public class Data {
    private int x;
    private int y;
    private boolean t;

    public Data(int x, int y, boolean t) {
        this.x = x > 0 ? x : 0;
        this.y = y > 0 ? y : 0;
        this.t = t;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getDeltaX() {
        return t ? 1 : 0;
    }

    public int getDeltaY() {
        return t ? 0 : 1;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "):" + (t ? "h" : "v");
    }

}
