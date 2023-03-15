package pl.javastart.task.finanse;

public class PozycjaKsiegowa {
    private String name;
    private double wartosc;

    public PozycjaKsiegowa(String name, double wartosc) {
        this.name = name;
        this.wartosc = wartosc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
}
