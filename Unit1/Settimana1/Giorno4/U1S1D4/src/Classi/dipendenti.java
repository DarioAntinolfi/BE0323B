package Classi;

public class dipendenti {
    public int indiceMatricola = 1;
    enum Livello {
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE
    }
    enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }
    protected double stipendioBase = 1000;
    protected int Matricola;
    protected double stipendio;
    public double importoOrarioStraordinario;
    protected String Livello;
    public String Dipartimento;

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

    public String getLivello() {
        return Livello;
    }

    public String getDipartimento() {
        return Dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(String dipartimento) {
        Dipartimento = dipartimento;
    }

    public dipendenti(String DipartimentoAssociato) {
        this.Matricola = indiceMatricola + 1;
        indiceMatricola++;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.Livello = "OPERAIO";
        this.Dipartimento = DipartimentoAssociato;
    }
}
