import org.w3c.dom.ls.LSOutput;

public class Main {
    Osoba osoba = new Osoba();
    osoba.setImie("Jaś");
    osoba.setWiek(-12);

    System.out.println(osoba.getImie());
    System.out.println(osoba.getWiek());
}