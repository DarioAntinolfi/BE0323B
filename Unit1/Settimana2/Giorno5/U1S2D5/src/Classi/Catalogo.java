package Classi;

public class Catalogo {

    public int codiceISBN;
    String titolo;
    int annoDiPubblicazione;
    int numeroPagine;

    public Catalogo(int codiceISBN, String titolo, int annoDiPubblicazione, int numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getCodiceISBN() {
        return codiceISBN;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
}

