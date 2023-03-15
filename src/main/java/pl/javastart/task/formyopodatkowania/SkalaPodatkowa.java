package pl.javastart.task.formyopodatkowania;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    private static final double STAWKA_PODATKOWA_1_PROG = 0.18;
    private static final double STAWKA_PODATKOWA_2_PROG = 0.32;
    private static final double KWOTA_GRANICZNA_1_PROG = 100_000;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        if (dochody >= KWOTA_WOLNA_OD_PODATKU && dochody <= KWOTA_GRANICZNA_1_PROG) {
            double kwotaOpodatkowana = dochody - KWOTA_WOLNA_OD_PODATKU;
            return kwotaOpodatkowana * STAWKA_PODATKOWA_1_PROG;
        }

        if (dochody > KWOTA_GRANICZNA_1_PROG) {
            double pierwszyProg = (KWOTA_GRANICZNA_1_PROG - KWOTA_WOLNA_OD_PODATKU) * STAWKA_PODATKOWA_1_PROG;
            double drugiProg = (dochody - KWOTA_GRANICZNA_1_PROG) * STAWKA_PODATKOWA_2_PROG;
            return pierwszyProg + drugiProg;
        }
        return 0;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Skala podatkowa";
    }
}
