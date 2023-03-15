package pl.javastart.task.formyopodatkowania;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final double STAWKA_PODATKOWA = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * STAWKA_PODATKOWA;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Ryczałt";
    }
}
