import Classi.Audio;
import Classi.ElementoMultimediale;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale Gioconda = new ElementoMultimediale("Gioconda", 0 );
        Gioconda.play();

        Audio Voce = new Audio("sale", 5);
        Voce.play();

    }
}