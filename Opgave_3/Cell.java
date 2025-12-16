package Opgave_3;

public class Cell {
    private String name;
    private boolean visible;

    public Cell(String name) {
        this.name = name;
        this.visible = true;
    }

    public String result() {
        if (this.visible){
            return String.valueOf(this.name);
        } else {
            return " ";
        }
    }

    public void toggle() {
        this.visible = !this.visible;
    }
}
