package pl.javastart.task.formyopodatkowania;

public class SkalaPodatkowa extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double przychody) {
        double dochody = przychody - zsumujWydatki();
        if (dochody >= 10_000 && dochody <= 100_000) {
            double kwotaOpodatkowana = dochody - 10_000;
            return kwotaOpodatkowana * 0.18;
        }

        if (dochody > 100_000) {
            double pierwszyProg = 90_000 * 0.18;
            double drugiProg = (dochody - 100_000) * 0.32;
            return pierwszyProg + drugiProg;
        }
        return 0;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Skala podatkowa";
    }
}
