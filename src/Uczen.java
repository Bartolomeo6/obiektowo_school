public class Uczen extends Osoba {

    private int nrUczen;

    public Uczen(String imie, int wiek, int nrUczen) {
        super(imie, wiek);          //super -> wywołanie konstruktora klasy głównej
        this.nrUczen = nrUczen;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUczen=" + nrUczen +
                "} " + super.toString();

        //super.toString() -> wywołanie toString z klasy bazowej
    }
}
