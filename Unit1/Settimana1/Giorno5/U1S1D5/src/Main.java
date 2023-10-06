import Classi.Audio;
import Classi.ElementoMultimediale;
import Classi.Immagine;
import Classi.Video;
import Interfacce.Riproducibilità;
import Enum.TipoElemento;

import java.lang.ref.WeakReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TipoElemento Elemento;
        String conversione = "Audio";
        String tipo = "";
        String nome = "";
        int durata = 0;
        ElementoMultimediale[] cronologia = new ElementoMultimediale[5];
        String[] nomi = {"uno", "due", "tre", "quattro","cinque"};
        Scanner input = new Scanner(System.in);
        Audio prova =new Audio("cane", 2);
        //for(int i = 0; i < 5; i++) {

            System.out.println("Inserisci un tipo di Elemento");
            conversione = input.nextLine();
            Elemento = TipoElemento.valueOf(conversione); // blocco del programma se si va in loop
            System.out.println("Inserisci un tipo contenuto");
            tipo = input.nextLine();
            //nomi[i] = tipo;
            System.out.println("Inserisci un nome contenuto");
            nome = input.nextLine();
            System.out.println("Inserisci un durata contenuto");
            durata = input.nextInt();

            switch (Elemento) {
                case Audio: {
                    Audio nomea = new Audio(nome, durata);
                    System.out.println("Hai creato un Audio");
                    cronologia[4] = cronologia[3];
                    cronologia[3] = cronologia[2];
                    cronologia[2] = cronologia[1];
                    cronologia[1] = cronologia[0];
                    cronologia[0] = nomea;
                    break;
                }
                case Video: {
                    Video muro = new Video(nome, durata);
                    System.out.println("Hai creato un Video");
                    cronologia[4] = cronologia[3];
                    cronologia[3] = cronologia[2];
                    cronologia[2] = cronologia[1];
                    cronologia[1] = cronologia[0];
                    cronologia[0] = muro;
                    break;
                }
                case Immagine: {
                    System.out.println("non poi creare immagini");
                    //i--;
                    break;
                }
                default: {
                    System.out.println("scelta non valida");
                    //i--;
                    break;
                }

            }

        //}
        System.out.println("Scegli cosa far eseguire (1 a 5)");
        int cursore = input.nextInt() - 1;

        System.out.println("Sta per partire un metodo di un elementodell'array");
        cronologia[cursore].play();



        input.close();

    }
}