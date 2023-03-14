package pl.javastart.task.formyopodatkowania;

public class PodatekLiniowy extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double przychody) {
        return (przychody - zsumujWydatki()) * 0.19;
    }

    @Override
    public String drukujFormeOpodatkowania() {
        return "Podatek liniowy";
    }
}
