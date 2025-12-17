package Testeksamen_1.Opgave_3;

public class Grid {
    private String[][] m;

    public Grid(int n) {
        if (n < 1 || n > 10) {
            throw new IllegalArgumentException();
        }
        m = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = "-";
            }
        }
    }

    public void draw(Data[] p) {
        int n = m.length;
        int i = 0;
        int j = 0;
        for (int k = 0; k < p.length; k++) {
            for (int count = 0; count < p[k].getCount(); count++) {
                m[i][j] = "" + p[k];
                if (k % 4 == 0) {
                    if (i < n - 1) {
                        i++;
                    }
                } else if (k % 4 == 1) {
                    if (j < n - 1) {
                        j++;
                    }
                } else if (k % 4 == 2) {
                    if (i > 0) {
                        i--;
                    }
                } else if (j > 0) {
                    j--;
                }
            }
        }
    }

    public String toString() {
        int n = m.length;
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s += m[i][j];
            }
            s += "\n";
        }
        return s;
    }
}
