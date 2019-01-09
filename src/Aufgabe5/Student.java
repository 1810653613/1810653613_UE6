package Aufgabe5;

public class Student {

    private String name;
    private int martikelnummer;
    private int jahrgang;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMartikelnummer()
    {
        return martikelnummer;
    }

    public void setMartikelnummer(int martikelnummer)
    {
        this.martikelnummer = martikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }

    public Student(String name, int martikelnummer, int jahrgang)
    {
        this.name=name;
        this.martikelnummer=martikelnummer;
        this.jahrgang=jahrgang;
    }
    @Override
    public String toString()
    {
        return(this.name + " " + this.martikelnummer + " " + this.jahrgang);
    }
}