package O1_4;

public class Student {
    private String naam;

    public Student(String nm)
    {
        this.naam = nm;
    }

    public String getNaam() {
        return this.naam;
    }

    @Override
    public String toString()
    {
       return "Deze student heet " + this.naam;
    }
}
