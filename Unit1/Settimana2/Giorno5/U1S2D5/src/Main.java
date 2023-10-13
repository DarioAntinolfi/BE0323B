import Classi.Catalogo;
import Classi.Libri;
import Classi.Riviste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

import static Classi.periodicità.mensile;
import static Classi.periodicità.settimanale;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner input = new Scanner(System.in);
        ArrayList<Libri> libri = new ArrayList<>();
        ArrayList<Riviste> riviste = new ArrayList<>();

        /*-Archivio di base-*/
        Libri libro1 = new Libri(1, "Aldo", 1995, 300, "Aldo Baglio", "Biografia");
        Libri libro2 = new Libri(2, "Giovanni", 1998, 350, "Aldo Baglio", "Commedia");
        Libri libro3 = new Libri(3, "Giacomo", 1992, 120, "Aldo Baglio", "Fantasy");
        Riviste rivista1 = new Riviste(4, "Gossip Oggi", 2022, 50, settimanale);
        Riviste rivista2 = new Riviste(5, "Chi l'ha visto?", 2006, 48, mensile);
        libri.add(libro1);
        libri.add(libro2);
        libri.add(libro3);
        riviste.add(rivista1);
        riviste.add(rivista2);

        /*-Aggiungere Libri-*/
        int indice = 6;
        boolean aggiungereLibro = true;
        String si = "si";
        while (aggiungereLibro) {
            System.out.println("Vuoi aggiungere un libro?");
            String risposta = input.nextLine();
            if (Objects.equals(risposta, si)){
                System.out.println("Inserire un titolo");
                String newTitolo = input.nextLine();
                System.out.println("Inserire anno di publicazione");
                int newAnnoDiPublicazione = Integer.parseInt(input.nextLine());
                System.out.println("Inserire numero di pagine");
                int newNumeroDiPagine = Integer.parseInt(input.nextLine());
                System.out.println("Inserire un autore");
                String newAutore = input.nextLine();
                System.out.println("Inserire una categotia");
                String newCategoria = input.nextLine();
                Libri newLibro = new Libri(indice, newTitolo, newAnnoDiPublicazione, newNumeroDiPagine, newAutore, newCategoria);
                indice++;
                libri.add(newLibro);

            } else{
                aggiungereLibro = false;
            }

        }

        /*-Aggiunta di riviste-*/

        boolean aggiungereRivista = true;
        while (aggiungereRivista) {
            System.out.println("Vuoi aggiungere una rivista?");
            String risposta = input.nextLine();
            if (Objects.equals(risposta, si)){
                System.out.println("Inserire un titolo");
                String newTitolo = input.nextLine();
                System.out.println("Inserire anno di publicazione");
                int newAnnoDiPublicazione = Integer.parseInt(input.nextLine());
                System.out.println("Inserire numero di pagine");
                int newNumeroDiPagine = Integer.parseInt(input.nextLine());
                System.out.println("Inserire periodicità");
                Enum newPeriodicità = mensile;
                Riviste newRivista = new Riviste(indice, newTitolo, newAnnoDiPublicazione, newNumeroDiPagine, newPeriodicità);
                indice++;
                riviste.add(newRivista);

            } else{
                aggiungereRivista = false;
            }

        }

        /*-rimozione-*/
        boolean rimuovere = true;
        while (rimuovere == true){
            System.out.println("Vuoi rimuovere un prodotto");
            String risposta = input.nextLine();
            if (Objects.equals(risposta, si)){
                System.out.println("inserisci il codice del prodotto da rimuovere");
                int codiceRimozione = Integer.parseInt(input.nextLine());

                //------------------------------------Eliminare


            } else {
                rimuovere = false;
            }
        }

        /*-ricerca per ISNB-*/

        System.out.println(libri);
        System.out.println(riviste);

    }
}