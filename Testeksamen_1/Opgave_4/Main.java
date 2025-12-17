package Testeksamen_1.Opgave_4;

public class Main {
    public static void main(String[] args) {
        Trekant x = new Trekant(11);
        Firkant y = new Firkant(22);
        Cirkel z = new Cirkel(33);
        Mangekant v = new Mangekant(44);
        Figur[] a = { x, y, z, v };
        printArray(a);
    }

    public static void printArray(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " " + a[i]);
        }
    }
}
