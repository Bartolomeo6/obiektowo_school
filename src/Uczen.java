public class Uczen extends Osoba {

    private int nrUczen;

    public Uczen(String imie, int wiek, int nrUczen) {
        super(imie, wiek);
        this.nrUczen = nrUczen;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUczen=" + nrUczen +
                "} " + super.toString();
    }
}
