public class Szkoła {
    private String nazwa;
    private static Szkoła szkola;
    private Szkoła(String nazwa) {
        this.nazwa = nazwa;
    }
    public static Szkoła getSzkola(String nazwa){
        if(Szkoła.szkola == null) {
            return new Szkoła(nazwa);
        }
            return szkola;
    }
}
