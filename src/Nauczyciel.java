import java.util.ArrayList;

public sealed class Nauczyciel extends Osoba implements Dyżurny permits Wychowawca {
    private ArrayList<String> przedmioty = new ArrayList<>();

    public Nauczyciel(String imie, int wiek, String przedmiot) {
        super(imie, wiek);
        przedmioty.add(przedmiot);
    }

    // ...nazwa -> tablica, kolekcja z wartościami po przecinku

    public Nauczyciel(String imie, int wiek, String ...przedmioty) {
        super(imie, wiek);

        for (String przedmiot:
             przedmioty) {
            this.przedmioty.add(przedmiot);
        }

    }

    @Override
    public String toString() {
        return "Nauczyciel{" + super.toString() +
                "przedmioty=" + przedmioty +
                "} ";
    }

    @Override
    public void dyżuruj() {
        System.out.println("Spacer po korytarzu");
    }
}
