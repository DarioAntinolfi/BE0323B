

public class Main {
    public static void main(String[] args) {
        /*-1-*/
        Rettangolo primorettangolo = new Rettangolo();
        primorettangolo.costruttore("Primo", 4, 7);
        primorettangolo.calcolaArea();
        primorettangolo.calcolaperimetro();
        primorettangolo.stampaArea();
        primorettangolo.stampaPerimetro();

        System.out.println(" ");

        Rettangolo secondorettangolo = new Rettangolo();
        secondorettangolo.costruttore("Secondo", 8, 3);
        secondorettangolo.calcolaArea();
        secondorettangolo.calcolaperimetro();
        secondorettangolo.stampaArea();
        secondorettangolo.stampaPerimetro();

        System.out.println(" ");

        double sommaArea = primorettangolo.area + secondorettangolo.area;
        double sommaPerimetro = primorettangolo.perimetro + secondorettangolo.perimetro;
        System.out.println("Area totale " + sommaArea);
        System.out.println("Perimetro totale " + sommaPerimetro);

    }
}