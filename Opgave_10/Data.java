package Opgave_10;

public class Data {
    private int x;
    private int y;
    private char z;

    public Data(int x, int y, String z) {
        this.x = x > 0 ? x : 0;
        this.y = y > 0 ? y : 0;
        this.z = z.charAt(0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public char getZ() {
        return this.z;
    }

    public void swap() {
        int temp = this.x;
        this.x = this.y;
        this.y = temp;
    }

    public String toString() {
        return this.z + "(" + this.x + "," + this.y + ")";
    }

}
