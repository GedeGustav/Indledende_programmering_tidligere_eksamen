package Opgave_2;

public class Karakter {
    private int tal;

    public Karakter(int K) {
        if (K == -3 || K == 0 || K == 2 || K == 4 || K == 7 || K == 10 || K == 12) {
            this.tal = K;
        } else {
            throw new IllegalArgumentException("Invalid grade: " + K);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(tal);
    }
}
