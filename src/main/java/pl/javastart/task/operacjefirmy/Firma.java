package pl.javastart.task.operacjefirmy;

import pl.javastart.task.finanse.FinanseFirmy;
import pl.javastart.task.finanse.Przychod;
import pl.javastart.task.finanse.Wydatek;
import pl.javastart.task.formyopodatkowania.FormaOpodatkowania;

import java.util.List;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.drukujFormeOpodatkowania());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        return zsumujFinanseFirmy(formaOpodatkowania.pobierzWydatki());
    }

    private double zsumujPrzychody() {
        return zsumujFinanseFirmy(formaOpodatkowania.pobierzPrzychody());
    }

    private double zsumujFinanseFirmy(List<? extends FinanseFirmy> finanseFirmy) {
        double sum = 0;
        for (FinanseFirmy ff : finanseFirmy) {
            sum += ff.getWartosc();
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        formaOpodatkowania.ustawPrzychody(new Przychod(nazwa, wartosc));
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        formaOpodatkowania.dodajWydatki(new Wydatek(nazwa, wartosc));
    }
}
