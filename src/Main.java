import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.setImie("Jas");
        osoba.setWiek(-12);

        System.out.println(osoba.getImie());
        System.out.println(osoba.getWiek());
    }

}