package Classi;

public class Immagine extends ElementoMultimediale{
    public Immagine(String titoloCostruttore) {
        super(titoloCostruttore);

    }
    int riproducibile = 0;
    int luminosità = 5;
    String luminositàStampa = "Luminosità ";
    public void mostraLuminosità(){
        for (int i = 0; i < luminosità; i++){
            luminositàStampa += "*";
        }
        System.out.println(luminositàStampa);
    }
    public void alzaLuminosità(){
        if (luminosità < 10){
            luminosità++;
        }
    }
    public void abbassaLuminosità(){
        if (luminosità > 0){
            luminosità--;
        }
    }
}
