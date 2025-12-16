package Opgave_6;

public class Data {
    private String comment;
    private int[] array;

    public Data(String comment, int[] array) {
        this.comment = comment;
        this.array = array;
    }

    public void erase(int min, int max) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] >= min && this.array[i] < max) {
                this.array[i] = -1;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comment).append(": ");
        for (int i = 0; i < this.array.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(this.array[i]);
        }

        return sb.toString();
    }
}
