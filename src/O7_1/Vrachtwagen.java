package O7_1;

public class Vrachtwagen extends Voertuig {
    private int laadvermogen;

    public Vrachtwagen() {
        super();
    }

    public Vrachtwagen(String merk, int laadvermogen) {
        super(merk);
        this.laadvermogen = laadvermogen;
    }

    public Vrachtwagen(String merk, String type, int laadvermogen) {
        super(merk, type);
        this.laadvermogen = laadvermogen;
    }
}
