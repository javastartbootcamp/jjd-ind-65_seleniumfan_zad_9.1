package pl.javastart.task.formyopodatkowania;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double STAWKA_PODATKOWA = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return (przychody - wydatki) * STAWKA_PODATKOWA;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Podatek liniowy";
    }
}
