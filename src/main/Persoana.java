package main;

public class Persoana{

    private static String nume;
    private static String prenume;
    private String oras;
    private int varsta;
    private boolean isCasatorita;
    public static String curs;


    public Persoana(){}

    public Persoana(String nume, String prenume, String oras, int varsta, boolean isCasatorita, String curs) {
        super();
        Persoana.nume = nume;
        Persoana.prenume = prenume;
        this.oras = oras;
        this.varsta = varsta;
        this.isCasatorita = true;
    }

    public static String curs() {
        return curs;
    }


    @Override
    public String toString() {
        return "Persoana [" +
                "nume=" + nume +
                ", prenume=" + prenume +
                ", oras=" + oras +
                ", varsta=" + varsta +
                " , casatorita=" + isCasatorita +
                ", curs=JAVA " +
                ']';
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        Persoana.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        Persoana.prenume = prenume;
    }
    public String getOras() {
        return oras;
    }
    public void setOras(String oras) {
        this.oras = oras;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public boolean getisCasatorita() {
        return isCasatorita;
    }
    public void setIsCasatorita(boolean isCasatorita) {this.isCasatorita = this.isCasatorita;}

    static int i=0;
    public void creste()
    {
        i++;
    }

    public static String obtineIdentificator(){
        return nume + prenume;
    }
}
