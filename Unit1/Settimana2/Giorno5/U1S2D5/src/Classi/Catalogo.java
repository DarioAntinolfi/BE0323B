package Classi;

public class Catalogo {

    int codiceISBN;
    String titolo;
    int annoDiPubblicazione;
    int numeroPagine;

    public Catalogo(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }
}
