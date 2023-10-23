package org.example.Entity;

public class Libri extends ElementiCatalogo{
    public Libri(String titolo, int annoProduzione, int numeroPagine, String autore, String genere) {
        super(titolo, annoProduzione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }
    String autore;
    String genere;

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
