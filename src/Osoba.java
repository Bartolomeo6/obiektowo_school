public class Osoba {
    private String imie;
    private int wiek;

    //hermetyzacja

    public Osoba() {

    }

    public Osoba(String imie) {
        this.imie = imie;
        this.wiek = 7;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    // dwa konstruktory o tej samej nazwie -> przeciążanie

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {

        if(wiek < 0)
            this.wiek = 0;

        else
            this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
