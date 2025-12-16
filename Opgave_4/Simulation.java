package Opgave_4;

public class Simulation {
    private int size;
    private Particle[] line;

    public Simulation(int size) {
        this.size = size;
        this.line = new Particle[size];
        for (int i = 0; i < this.size; i++) {
            line[i] = null;
        }
    }

    public void create(int x, String p) {
        if (x < 0 || x >= size) {
            throw new IllegalArgumentException("Indeks udenfor grænser: " + x);
        }
        if (line[x] != null) {
            throw new IllegalArgumentException("Der findes allerede en partikel på indeks: " + x);
        }
        char h = p.charAt(0);
        line[x] = new Particle(h);
    }

    public void update() {
        for (int i = 0; i < size; i++) {
            if (line[i] != null) {
                int j = i + line[i].step();
                if (j >= 0 && j < size && line[j] == null) {
                    line[j] = line[i];
                    line[i] = null;
                } else {
                    line[i].reverse();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (line[i] != null) {
                sb.append(line[i].toString());
            } else {
                sb.append(" ");
            }
            if (i < size - 1)
                sb.append(" ");
        }
        return sb.toString();
    }

}
