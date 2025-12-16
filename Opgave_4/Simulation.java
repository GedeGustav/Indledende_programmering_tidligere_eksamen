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
        Particle[] newLine = new Particle[size];
        boolean[] moved = new boolean[size]; // Track if a particle has already moved
        for (int i = 0; i < size; i++) {
            if (line[i] != null && !moved[i]) {
                int pos = i;
                Particle p = line[i];
                while (true) {
                    int move = p.step();
                    int nextPos = pos + move;
                    // Check if next position is valid and empty
                    if (move != 0 && nextPos >= 0 && nextPos < size && newLine[nextPos] == null && line[nextPos] == null) {
                        pos = nextPos;
                    } else {
                        // If can't move, reverse direction and stop
                        if (move != 0) {
                            p.reverse();
                        }
                        break;
                    }
                }
                newLine[pos] = p;
                moved[pos] = true;
            }
        }
        line = newLine;
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
