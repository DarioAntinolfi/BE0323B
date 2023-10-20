package org.example.Entity;

import java.util.Date;

public class Riviste extends ElementiCatalogo{
    public Riviste(String titolo, Date annoProduzione, int numeroPagine, Enum periodicità) {
        super(titolo, annoProduzione, numeroPagine);
        this.periodicità = periodicità;
    }
    Enum periodicità;

    public Enum getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Enum periodicità) {
        this.periodicità = periodicità;
    }
}
