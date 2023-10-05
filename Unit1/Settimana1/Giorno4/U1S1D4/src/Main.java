import Classi.dipendenti;

public class Main {
    public static void main(String[] args) {
       dipendenti Carlo = new dipendenti (1, dipendenti.DipartimentoEnum.PRODUZIONE);
       Carlo.stampaDati();

       dipendenti Luca = new dipendenti (2, dipendenti.DipartimentoEnum.AMMINISTRAZIONE);
       Luca.stampaDati();

       dipendenti Giacomo = new dipendenti (3, 350,40, dipendenti.LivelloEnum.IMPIEGATO, dipendenti.DipartimentoEnum.VENDITE);
       Giacomo.stampaDati();

       Carlo.promozione();
       Carlo.stampaDati();

    }
}