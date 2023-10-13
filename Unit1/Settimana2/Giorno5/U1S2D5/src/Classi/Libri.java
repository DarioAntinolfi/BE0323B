package Classi;

public class Libri extends Catalogo {
    public Libri(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine) {
        super(codiceISBN, titolo, annoDiPubblicazione, numeroPagine);
    }
    String autore;
    String genere;

    public Libri(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine, String autore, String genere) {
        super(codiceISBN, titolo, annoDiPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }
}
