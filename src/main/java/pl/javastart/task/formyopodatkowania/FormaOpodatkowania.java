package pl.javastart.task.formyopodatkowania;

import pl.javastart.task.finanse.Przychod;
import pl.javastart.task.finanse.Wydatek;

import java.util.ArrayList;
import java.util.List;

public class FormaOpodatkowania {
    private List<Przychod> przychody = new ArrayList<>();
    private List<Wydatek> wydatki = new ArrayList<>();

    public double wyliczPodatek(double przychody) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }

    public double zsumujWydatki() {
        List<Wydatek> wydatki = pobierzWydatki();
        double sum = 0;
        for (Wydatek wydatek : wydatki) {
            sum += wydatek.getWartosc();
        }
        return sum;
    }

    public String drukujFormeOpodatkowania() {
        return "";
    }

    public List<Wydatek> pobierzWydatki() {
        return wydatki;
    }

    public List<Przychod> pobierzPrzychody() {
        return przychody;
    }

    public void ustawPrzychody(Przychod przychod) {
        przychody.add(przychod);
    }

    public void dodajWydatki(Wydatek wydatek) {
        wydatki.add(wydatek);
    }
}
