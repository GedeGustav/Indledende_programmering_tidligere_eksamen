```
package Opgave_10;

public class Grid {
    private Data[] a;

    public Grid(char[][] m) {
        int rows = m.length;
        int cols = m[0].length;
        this.a = new Data[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.a[index++] = new Data(i, j, "" + m[i][j]);
            }
        }
    }

    public void swap(String z) {
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i].getZ() == z.charAt(0)){
                this.a[i].swap();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.length; i++){
            if (i > 0) sb.append(";");
            sb.append(this.a[i]);
        }
        return sb.toString();
    }
}
```