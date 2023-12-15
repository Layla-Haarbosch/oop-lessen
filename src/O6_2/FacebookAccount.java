package O6_2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden = new ArrayList<>();

    public FacebookAccount(String nm) {
        this.naam = nm;
    }

    public String getNaam() {
        return this.naam;
    }

    public void voegVriendToe(Vriend nwV) {
        if (!this.mijnVrienden.contains(nwV)) {
            this.mijnVrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV) {
        return this.mijnVrienden.remove(exV);
    }

    public boolean isVriendMet(Vriend v) {
        return this.mijnVrienden.contains(v);
    }

    public int aantalVrienden()
    {
        return this.mijnVrienden.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(this.naam + " heeft " + this.aantalVrienden() + " vrienden:\n");

        for (Vriend v : this.mijnVrienden) {
            result.append(v.toString() + '\n');
        }

        return result.toString();
    }
}
