import Classi.Libri;
import Classi.Riviste;

import static Classi.periodicità.mensile;
import static Classi.periodicità.settimanale;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        /*-Archivio di base-*/
        Libri libro1 = new Libri(1, "Aldo", 1995, 300, "Aldo Baglio", "Biografia");
        Libri libro2 = new Libri(2, "Giovanni", 1998, 350, "Aldo Baglio", "Commedia");
        Libri libro3 = new Libri(3, "Giacomo", 1992, 120, "Aldo Baglio", "Fantasy");
        Riviste rivista1 = new Riviste(4, "Gossip Oggi", 2022, 50, settimanale);
        Riviste rivista2 = new Riviste(5, "Chi l'ha visto?", 2006, 48, mensile);



    }
}