import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.setImie("Jas");
        osoba.setWiek(-12);

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



    }

}