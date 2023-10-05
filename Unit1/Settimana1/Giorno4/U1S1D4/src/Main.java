import Classi.Dipartimento;
import Classi.Dipendente;
import Classi.Livello;

public class Main {
    public static void main(String[] args) {
       Dipendente Carlo = new Dipendente (1, Dipartimento.PRODUZIONE);
       Carlo.stampaDati();

        Dipendente Luca = new Dipendente (2, Dipartimento.AMMINISTRAZIONE);
       Luca.stampaDati();

        Dipendente Giacomo = new Dipendente (3, 350,40, Livello.IMPIEGATO, Dipartimento.VENDITE);
       Giacomo.stampaDati();

       Carlo.promozione();
       Carlo.stampaDati();

    }
}