package Testeksamen_2.Opgave_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Data a = new Data('A', 1, true);
        Data b = new Data('B', 2, false);
        Data c = new Data('C', 3, true);
        Data d = new Data('D', 4, false);
        Data e = new Data('E', 5, true);
        Data[] array = { a, b, c, d, e };
        System.out.println(Arrays.toString(array));
        Grid square = new Grid(array, 6, 6);
        System.out.println(square + "----------");
        square.stretch();
        System.out.println(square + "----------");
    }
}
