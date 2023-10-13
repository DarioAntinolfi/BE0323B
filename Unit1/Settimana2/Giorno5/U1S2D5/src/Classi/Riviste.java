package Classi;

public class Riviste extends Catalogo{
    public Riviste(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine) {
        super(codiceISBN, titolo, annoDiPubblicazione, numeroPagine);
    }
    Enum periodicità;

    public Riviste(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine, Enum periodicità) {
        super(codiceISBN, titolo, annoDiPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }
}
