package Classi;

public abstract class ElementoMultimediale {
    protected String titolo = "";
    protected int riproducibile;

    public ElementoMultimediale(String titoloCostruttore, int riproducibileCostruttore) {
        this.titolo = titoloCostruttore;
        this.riproducibile = riproducibileCostruttore;
    }
    public ElementoMultimediale(String titoloCostruttore) {
        this.titolo = titoloCostruttore;
    }

    public void play(){
        if (riproducibile == 0) {
            System.out.println("Questo elemento non è riproducibile");
        } else {
            for (int i = 0; i < riproducibile; i++){
                System.out.println(titolo);
            }
        }
    }
}
