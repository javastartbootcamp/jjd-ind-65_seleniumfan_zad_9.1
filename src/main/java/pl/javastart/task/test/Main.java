package pl.javastart.task.test;

import pl.javastart.task.formyopodatkowania.NaCzarno;
import pl.javastart.task.formyopodatkowania.PodatekLiniowy;
import pl.javastart.task.formyopodatkowania.RyczaltEwidencjonowany;
import pl.javastart.task.formyopodatkowania.SkalaPodatkowa;
import pl.javastart.task.operacjefirmy.Firma;

public class Main {

    public static void main(String[] args) {
        // na czarno
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        // ryczałt
        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        // podatek liniowy
        Firma ivanosCompany = new Firma("Firma Ivans Company", new PodatekLiniowy());

        ivanosCompany.dodajPrzychod("Tworzenie kubków - ceramika", 25_000);
        ivanosCompany.dodajWydatek("Glina", 4_000);

        ivanosCompany.wyswietlPodsumowanie();

        // skala podatkowa
        Firma lokalnaPiekarnia = new Firma("Lokalna piekarnia", new SkalaPodatkowa());

        lokalnaPiekarnia.dodajPrzychod("Sprzedaż favorków", 150_000);
        lokalnaPiekarnia.dodajWydatek("Pączki", 20_000);

        lokalnaPiekarnia.wyswietlPodsumowanie();
    }

}
