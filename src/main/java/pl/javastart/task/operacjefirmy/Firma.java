package pl.javastart.task.operacjefirmy;

import pl.javastart.task.finanse.PozycjaKsiegowa;
import pl.javastart.task.formyopodatkowania.FormaOpodatkowania;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private List<PozycjaKsiegowa> przychody = new ArrayList<>();
    private List<PozycjaKsiegowa> wydatki = new ArrayList<>();

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
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, zsumujWydatki()));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        return zsumujFinanseFirmy(wydatki);
    }

    private double zsumujPrzychody() {
        return zsumujFinanseFirmy(przychody);
    }

    private double zsumujFinanseFirmy(List<PozycjaKsiegowa> finanseFirmy) {
        double sum = 0;
        for (PozycjaKsiegowa ff : finanseFirmy) {
            sum += ff.getWartosc();
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody.add(new PozycjaKsiegowa(nazwa, wartosc));
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki.add(new PozycjaKsiegowa(nazwa, wartosc));
    }

    public List<PozycjaKsiegowa> pobierzPrzychody() {
        return przychody;
    }

    public List<PozycjaKsiegowa> pobierzWydatki() {
        return wydatki;
    }
}
