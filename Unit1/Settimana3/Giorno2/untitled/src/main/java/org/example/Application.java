package org.example;

import org.example.utils.TipoEvento;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Evento natale = new Evento("Natale", "Festa di Natale", TipoEvento.PRIVATO, 30);

    }

}
