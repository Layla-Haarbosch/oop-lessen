package O7_1;

public class Voertuig {
    private String merk;
    private String type;

    public Voertuig()
    {
        this("onbekend");
    }

    public Voertuig(String merk) {
        this.merk = merk;
    }

    public Voertuig(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
