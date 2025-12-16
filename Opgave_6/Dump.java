package Opgave_6;

public class Dump {
    private Data[] data;

    public Dump(Data[] data, int min, int max) {
        this.data = data;
        for (int i = 0; i < this.data.length; i++) {
            this.data[i].erase(min, max);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.data.length; i++) {
            sb.append(this.data[i].toString());
            sb.append("\n");
        }
        sb.append("----");

        return sb.toString();
    }
}
