package Testeksamen_2.Opgave_1;

public class Data {
    private char marking;
    private int position;
    private boolean flag;

    public Data(char marking, int position, boolean flag) {
        this.marking = marking;
        this.position = position < 0 ? 0 : position;
        this.flag = flag;
    }

    public char getMarking() {
        return marking;
    }

    public int getPosition() {
        return position;
    }

    public boolean getFlag() {
        return flag;
    }

    public String toString() {
        return (flag ? "POSITIV" : "NEGATIV") + position + marking;
    }
}
