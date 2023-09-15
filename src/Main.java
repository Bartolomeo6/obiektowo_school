import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.setImie("Jas");
        osoba.setWiek(-12);

        System.out.println("--------------------------------");

        // ------------------------------------------------------------ //

        System.out.println(osoba.getImie());
        System.out.println(osoba.getWiek());

        Uczen uczen = new Uczen("Bożydar",7,1235);
        System.out.println(uczen);

        System.out.println("Liczba uczniów: "+Uczen.liczbaUcz);

        Uczen uczen2 = new Uczen("Ksawery",8);
        System.out.println(uczen2);

        System.out.println("Liczba uczniów: "+Uczen.liczbaUcz);

        Uczen uczen3 = new Uczen("Zygmunt",10);
        System.out.println(uczen);

        System.out.println("Liczba uczniów: "+Uczen.liczbaUcz);

        System.out.println("--------------------------------");

        // ------------------------------------------------ //

        Nauczyciel nauczyciel = new Nauczyciel("Vincent",30,"wf","matematyka");
        System.out.println(nauczyciel);

        Nauczyciel nauczyciel2 = new Nauczyciel("Franciszek",20,"język chiński");
        System.out.println(nauczyciel2);

        System.out.println("--------------------------------");

        // ------------------------------------------------ //

        Klasa klasa2p = new Klasa("Klasa P",uczen,uczen2);

        Uczen uczen4 = new Uczen("Edek",6);

        Klasa klasa3p = new Klasa(klasa2p);
        Klasa klasa4p = klasa2p;

        klasa2p.dodajUczniaDoKlasy(uczen4);

        System.out.println(klasa2p);
        System.out.println(klasa3p);
        System.out.println(klasa4p);

        System.out.println("--------------------------------");

        // ------------------------------------------------ //

        Nauczyciel wychowawca = new Wychowawca("Krystyna",55,klasa3p,"język polski");
        System.out.println(wychowawca);

        wychowawca.dyżuruj();
        uczen2.dyżuruj();
    }

}