import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private String nazwa;

    public Klasa(ArrayList<Uczen> uczniowie, String nazwa) {
        this.uczniowie = uczniowie;
        this.nazwa = nazwa;
    }

    //konstruktor kopiujący

    public Klasa(Klasa klasa) {

        //this.uczniowie = (ArrayList<Uczen>) klasa.uczniowie.clone();

        this.uczniowie = new ArrayList<>(klasa.uczniowie);
        this.nazwa = klasa.nazwa;


    }

    public void dodajUczniaDoKlasy(Uczen uczen){
        if(!uczniowie.contains(uczen)){
            this.uczniowie.add(uczen);
        }
    }

    public Klasa(String nazwa, Uczen ...uczniowie) {
        this.nazwa = nazwa;

        //TODO: DODAĆ UCZNIÓW DO UCZNIOWIE

        for (Uczen uczen:
             uczniowie) {
            this.uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" + ", nazwa='" + nazwa + '\'' +
                "uczniowie=" + uczniowie + '}';

    }
}
