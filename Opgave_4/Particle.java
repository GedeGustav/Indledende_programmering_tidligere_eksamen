package Opgave_4;

public class Particle {
    private char name;
    private int energy;
    private boolean forward;

    public Particle(char name) {
        this.name = name;
        this.energy = 9;
        this.forward = true;
    }

    public int step() {
        int result;
        if (this.energy == 0) {
            result = 0;
        } else if (this.forward) {
            result = 1;
        } else {
            result = -1;
        }
        if (this.energy > 0) {
            this.energy--;
        }
        return result;
    }

    public void reverse() {
        if (this.energy > 0) {
            this.forward = !this.forward;
        }
    }

    @Override
    public String toString() {
        String x = String.valueOf(this.name) + String.valueOf(this.energy);
        if (this.forward) {
            x = x + ">";
        } else {
            x = x + "<";
        }
        return x;
    }
}
