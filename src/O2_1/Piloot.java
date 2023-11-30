package O2_1;

public class Piloot {
    private String naam;
    private int vlieguren;
    private double salaris;

    public Piloot(String naam) {
        this.naam = naam;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int aantal) {
        this.vlieguren += aantal;
    }

    /* Convention: always show all attributes */
    @Override
    public String toString() {
        return this.naam + " heeft " + this.vlieguren  + " vlieguren gemaakt en verdient " + this.salaris;
    }
}
