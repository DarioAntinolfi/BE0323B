package Classi;

public class Video extends ElementoMultimediale{
    public Video(String titoloCostruttore, int riproducibileCostruttore) {
        super(titoloCostruttore, riproducibileCostruttore);

    }
    protected boolean riproduzione = true;
    int volume = 5;
    String volumeStampa = "Volume ";
    int luminosità = 5;
    String luminositàStampa = "Luminosità ";
    public void mostraVolume(){
        for (int i = 0; i < volume; i++){
            volumeStampa += "!";
        }
        System.out.println(volumeStampa);
    }
    public void alzaVolume(){
        if (volume < 10){
            volume++;
        }
    }
    public void abbassaVolume(){
        if (volume > 0){
            volume--;
        }
    }
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
