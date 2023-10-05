import Classi.dipendenti;

public class Main {
    public static void main(String[] args) {
       dipendenti Carlo = new dipendenti ("PRODUZIONE");

        System.out.println("Matricola " + Carlo.getMatricola());
        System.out.println("Stipendio " + Carlo.getStipendio());
        System.out.println("Straordinario " + Carlo.getImportoOrarioStraordinario());
        System.out.println("Livello " + Carlo.getLivello());
        System.out.println("Dipartimento " + Carlo.getDipartimento());
    }
}