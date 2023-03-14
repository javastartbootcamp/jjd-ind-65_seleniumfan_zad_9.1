package pl.javastart.task.formyopodatkowania;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Ryczałt";
    }
}
