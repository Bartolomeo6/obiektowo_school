public class Uczen extends Osoba {

    private int nrUczen;
    public static int liczbaUcz;

    public Uczen(String imie, int wiek, int nrUczen) {
        super(imie, wiek);          //super -> wywołanie konstruktora klasy głównej
        this.nrUczen = nrUczen;
        liczbaUcz++;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUcz++;
        nrUczen = liczbaUcz;
    }

    @Override   //nadpisujemy istniejącą metodę
    public String toString() {
        return "Uczen{" +
                "nrUczen=" + nrUczen +
                "} " + super.toString();

        //super.toString() -> wywołanie toString z klasy bazowej
    }
}
