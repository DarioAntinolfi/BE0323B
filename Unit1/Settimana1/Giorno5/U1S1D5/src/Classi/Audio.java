package Classi;

public class Audio extends ElementoMultimediale{

    public Audio(String titoloCostruttore, int riproducibileCostruttore) {
        super(titoloCostruttore, riproducibileCostruttore);

    }
    protected boolean riproduzione = true;
    int volume = 5;
    String volumeStampa = "Volume ";
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
