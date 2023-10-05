package Classi;

public class dipendenti {
    enum LivelloEnum {
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE
    }
    enum DipartimentoEnum {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }
    protected double stipendioBase = 1000;
    protected int Matricola;
    protected double stipendio;
    public double importoOrarioStraordinario;
    protected LivelloEnum Livello;
    public DipartimentoEnum Dipartimento;

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return Matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public LivelloEnum getLivello() {
        return Livello;
    }

    public DipartimentoEnum getDipartimento() {
        return Dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDati() {
        aggiornaStipendio();
        System.out.println("Matricola " + getMatricola());
        System.out.println("Stipendio " + getStipendio());
        System.out.println("Straordinario " + getImportoOrarioStraordinario());
        System.out.println("Livello " + getLivello());
        System.out.println("Dipartimento " + getDipartimento());
        System.out.println(" ");
    }

    public void setDipartimento(DipartimentoEnum dipartimento) {
        Dipartimento = dipartimento;
    }

    public dipendenti(int indiceMatricola, DipartimentoEnum DipartimentoAssociato) {
        this.Matricola = indiceMatricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.Livello = LivelloEnum.OPERAIO;
        this.Dipartimento = DipartimentoAssociato;
    }

    public dipendenti(int indiceMatricola,double stipendio, double importoOrarioStraordinario, LivelloEnum Livello,  DipartimentoEnum DipartimentoAssociato) {
        this.Matricola = indiceMatricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.Livello = Livello;
        this.Dipartimento = DipartimentoAssociato;
    }

    public void promozione() {
        switch (this.Livello) {
            case DIRIGENTE: {
                System.out.println("ERRORE");
                break;
            }
            case QUADRO: {
                this.Livello = LivelloEnum.DIRIGENTE;
                System.out.println("Ora sei dirigente");
                break;
            }
            case IMPIEGATO: {
                this.Livello = LivelloEnum.QUADRO;
                System.out.println("Ora sei quadro");
                break;
            }
            case OPERAIO: {
                this.Livello = LivelloEnum.IMPIEGATO;
                System.out.println("Ora sei impiegato");
                break;
            }
            default: {
                System.out.println("ERRORE DI SISTEMA");
                break;
            }
        }
        System.out.println(" ");
    }
    public void aggiornaStipendio(){
        switch (this.Livello) {
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

