package Classi;

public class Audio extends ElementoMultimediale{

    public Audio(String titoloCostruttore, int riproducibileCostruttore) {
        super(titoloCostruttore, riproducibileCostruttore);

    }
    int volume = 5;
    String volumeStampa = "";
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
}
