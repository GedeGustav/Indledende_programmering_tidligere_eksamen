package Testeksamen_1.Opgave_1;

public class Draw {
    public static void main(String[] args) {
        figure(1);
        figure(3);
        figure(6);
    }

    public static void figure(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("X");
            }
            System.out.print("Y");
            for (int j = 0; j < i; j++) {
                System.out.print("Z");
            }
            System.out.println();
        }
    }
}
