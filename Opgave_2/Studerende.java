package Opgave_2;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private String navn;
    private List<Karakter> karakterer;

    public Studerende(String navn, int antalKarakterer){
        this.navn = navn;
        this.karakterer = new ArrayList<>();
        for(int i = 0; i < antalKarakterer; i++) {
            karakterer.add(null);
        }
    }

    public void karakter(int fag, int grade){
        int index = fag - 1;
        if (index >= 0 && index < karakterer.size()) {
            karakterer.set(index, new Karakter(grade));
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(navn);
        for(Karakter k : karakterer) {
            sb.append(" ").append(k == null ? "--" : k.toString());
        }
        return sb.toString();
    }
}
