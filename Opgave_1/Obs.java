package Opgave_1;

public class Obs {
    private String value;
    private String comment;

    public Obs(String v, String c) {
        this.value = v;
        this.comment = c;
    }

    public String getValue() {
        return this.value;
    }

    public String getComment() {
        return this.comment;
    }
}
