public class Rettangolo {
    String nome;
    double altezza;
    double larghezza;
    double area;
    double perimetro;
    public void costruttore (String a, double b, double c){
        this.nome = a;
        this.altezza = b;
        this.larghezza = c;
    }
    public void calcolaArea() {
        area = altezza * larghezza;
    }
    public void calcolaperimetro() {
        perimetro = (altezza + larghezza) * 2;
    }
    public void stampaArea() {
        System.out.println("Area" + " " + nome + " " + area);
    }
    public void stampaPerimetro() {
        System.out.println("Perimetro" + " " + nome + " " + perimetro);
    }
}
