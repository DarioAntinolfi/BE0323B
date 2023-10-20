package org.example.Entity;

import java.util.Date;

public class Prestiti {
    long utente;
    long elemento;
    Date inizioPrestito;
    Date restituzionePrevista;
    Date restituzioneEffettiva;

    public Prestiti(long utente, long elemento, Date inizioPrestito, Date restituzionePrevista, Date restituzioneEffettiva) {
        this.utente = utente;
        this.elemento = elemento;
        this.inizioPrestito = inizioPrestito;
        this.restituzionePrevista = restituzionePrevista;
        this.restituzioneEffettiva = restituzioneEffettiva;
    }

    public long getUtente() {
        return utente;
    }

    public void setUtente(long utente) {
        this.utente = utente;
    }

    public long getElemento() {
        return elemento;
    }

    public void setElemento(long elemento) {
        this.elemento = elemento;
    }

    public Date getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(Date inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public Date getRestituzionePrevista() {
        return restituzionePrevista;
    }

    public void setRestituzionePrevista(Date restituzionePrevista) {
        this.restituzionePrevista = restituzionePrevista;
    }

    public Date getRestituzioneEffettiva() {
        return restituzioneEffettiva;
    }

    public void setRestituzioneEffettiva(Date restituzioneEffettiva) {
        this.restituzioneEffettiva = restituzioneEffettiva;
    }
}
