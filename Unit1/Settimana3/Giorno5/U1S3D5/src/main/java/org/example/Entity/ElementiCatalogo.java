package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table (name = "Elementi")
public class ElementiCatalogo {
    @Id
    @GeneratedValue
    protected long codiceISBN;
    protected String titolo;
    protected int annoProduzione;
    protected int numeroPagine;

    public ElementiCatalogo(String titolo, int annoProduzione, int numeroPagine) {
        this.titolo = titolo;
        this.annoProduzione = annoProduzione;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }
}
