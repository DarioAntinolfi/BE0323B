import Classi.dipendenti;

public class Main {
    public static void main(String[] args) {
       dipendenti Carlo = new dipendenti (1,"PRODUZIONE");
       Carlo.stampaDati();

       dipendenti Luca = new dipendenti (2,"AMMINISTRAZIONE");
       Luca.stampaDati();

       dipendenti Giacomo = new dipendenti (3, 350,40, "IMPIEGATO", "VENDITE");
       Giacomo.stampaDati();

       Carlo.promozione();
       Carlo.stampaDati();

    }
}