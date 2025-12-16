package Opgave_7;

public class Grid {
    private char[][] m;
    private int n;

    public Grid(int n, Data[] m) {
        this.n = n > 0 ? n : 0;
        this.m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.m[i][j] = "-".charAt(0);
            }
        }

        for (int i = 0; i < m.length; i++) {
            int x = m[i].getX();
            int y = m[i].getY();
            if (y >= 0 && y < n && x >= 0 && x < n) {
                this.m[y][x] = '<';
            }
            int dx = x + m[i].getDeltaX();
            int dy = y + m[i].getDeltaY();
            if (dy >= 0 && dy < n && dx >= 0 && dx < n) {
                this.m[dy][dx] = '>';
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = m.length - 1; i > -1; i--) {
            sb.append(m[i]);
            sb.append("\n");
        }

        return sb.toString();
    }
}
