package Classi;

public class Dipendente {
    protected double stipendioBase = 1000;
    protected int matricola;
    protected double stipendio;
    public double importoOrarioStraordinario;
    protected Livello livello;
    public Dipartimento dipartimento;

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDati() {
        System.out.println("Matricola " + getMatricola());
        System.out.println("Stipendio " + getStipendio());
        System.out.println("Straordinario " + getImportoOrarioStraordinario());
        System.out.println("Livello " + getLivello());
        System.out.println("Dipartimento " + getDipartimento());
        System.out.println(" ");
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(int indiceMatricola, Dipartimento DipartimentoAssociato) {
        this.matricola = indiceMatricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.dipartimento = DipartimentoAssociato;
    }

    public Dipendente(int indiceMatricola,double stipendio, double importoOrarioStraordinario, Livello livello,  Dipartimento DipartimentoAssociato) {
        this.matricola = indiceMatricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = DipartimentoAssociato;
    }

    public void promozione() {
        switch (this.livello) {
            case DIRIGENTE: {
                System.out.println("ERRORE");
                break;
            }
            case QUADRO: {
                this.livello = Livello.DIRIGENTE;
                System.out.println("Ora sei dirigente");
                break;
            }
            case IMPIEGATO: {
                this.livello = Livello.QUADRO;
                System.out.println("Ora sei quadro");
                break;
            }
            case OPERAIO: {
                this.livello = Livello.IMPIEGATO;
                System.out.println("Ora sei impiegato");
                break;
            }
            default: {
                System.out.println("ERRORE DI SISTEMA");
                break;
            }
        }
        aggiornaStipendio();
        System.out.println(" ");
    }
    public void aggiornaStipendio(){
        switch (this.livello) {
            case DIRIGENTE: {
                this.stipendio = stipendioBase * 2;
                break;
            }
            case QUADRO: {
                this.stipendio = stipendioBase * 1.5;
                break;
            }
            case IMPIEGATO: {
                this.stipendio = stipendioBase * 1.2;
                break;
            }
            case OPERAIO: {
                this.stipendio = stipendioBase * 1;
                break;
            }
            default: {
                System.out.println("ERRORE DI SISTEMA");
                break;
            }
        }
    }
}

