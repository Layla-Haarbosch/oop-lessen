package O6_2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnm, String anm, String em) {
        this.voornaam = vnm;
        this.achternaam = anm;
        this.email = em;
    }

    @Override
    public boolean equals(Object andereObject)
    {
        boolean objectenGelijk = false;

        if (andereObject instanceof Vriend) {
            Vriend huidigeVriend = (Vriend) andereObject;

            if (this.voornaam.equals(huidigeVriend.voornaam) &&
                this.achternaam.equals(huidigeVriend.achternaam) &&
                this.email.equals(huidigeVriend.email))   {

                objectenGelijk = true;
            }
        }

        return objectenGelijk;
    }

    @Override
    public String toString()
    {
        return this.voornaam + " " + this.achternaam + ", email: " + this.email;
    }
}
