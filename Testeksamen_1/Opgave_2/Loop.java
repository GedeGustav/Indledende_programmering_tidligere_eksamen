package Testeksamen_1.Opgave_2;

import java.util.*;

public class Loop {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a negative integer to stop.");
        int n;
        do {
            System.out.print("Enter any integer: ");
            n = console.nextInt();
            a.add(n);
        } while (n >= 0);
        System.out.println("Here are the integers entered:");
        for (int i = 0; i < a.size(); i++) {
            System.out.println("#" + (i + 1) + " " + a.get(i));
        }
        System.out.println("The last integer was a negative integer.");
    }
}
