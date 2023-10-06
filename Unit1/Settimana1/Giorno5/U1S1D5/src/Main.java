import Classi.Audio;
import Classi.ElementoMultimediale;
import Classi.Immagine;
import Classi.Video;
import Interfacce.Riproducibilità;
import Enum.TipoElemento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*-elemento multimediale-*/
        /*
        ElementoMultimediale Gioconda = new ElementoMultimediale("Gioconda", 0 );
        Gioconda.play();
        */

        /*-audio-*/
        /*
        Audio Voce = new Audio("sale", 5);
        Voce.play();
        Voce.abbassaVolume();
        Voce.mostraVolume();
         */

        /*-video-*/
        /*
        Video Cartoni = new Video("dragonball", 9);
        Cartoni.play();
        Cartoni.abbassaVolume();
        Cartoni.mostraVolume();
        Cartoni.mostraLuminosità();
         */

        /*-immagini-*/
        /*
        Immagine Foto = new Immagine("mare");
        Foto.alzaLuminosità();
        Foto.mostraLuminosità();
        Foto.play();
        */

        /*-Array-*/
        TipoElemento Elemento;
        String conversione = "Audio";
        String tipo = "";
        String nome = "";
        int durata = 0;
        ElementoMultimediale[] cronologia = new ElementoMultimediale[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un tipo di Elemento");
        conversione = input.nextLine();
        Elemento = TipoElemento.valueOf(conversione);
        System.out.println("Inserisci un tipo contenuto");
        tipo = input.nextLine();
        System.out.println("Inserisci un nome contenuto");
        nome = input.nextLine();
        System.out.println("Inserisci un durata contenuto");
        durata = input.nextInt();

        switch (Elemento){
            case Audio:{
                Audio $tipo = new Audio(nome, durata);
                break;
            }
            case Video:{
                Video $tipo = new Video(nome, durata);
                break;
            }
            case Immagine: {
                System.out.println("non poi inserire immagini");
            }
            default:{
                System.out.println("scelta non valida");
                break;
            }

        }

        Video cane = new Video("baldo", 4);
        cronologia[0] = cane;

        input.close();
    }
}