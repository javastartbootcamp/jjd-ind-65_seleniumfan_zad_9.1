package pl.javastart.task.formyopodatkowania;

public class NaCzarno extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double przychody) {
        return 0;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Na czarno";
    }
}
