package O4_2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;
    public Eigenaar(String nm) {
        naam = nm;
    }

    public Huisdier getBeestje() {
        return beestje;
    }

    public void setBeestje(Huisdier hd) {
        this.beestje = hd;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr()  { return giroNr; }
    public String getNaam() { return naam; }

    public String toString() {
        return this.naam + " heeft giro " + this.giroNr + ". En is het baasje van " + this.beestje;
    }
}