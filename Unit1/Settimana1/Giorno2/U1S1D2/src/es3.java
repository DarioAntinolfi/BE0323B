import java.util.Scanner;
/*-error-*/
public class es3 {
    public static void main(String[] args) {
        String chiusura = ":q";
        Scanner input = new Scanner(System.in);
        String stringa = "inizio";
        String v = ", ";
        String risultato = "";

        while (stringa.equals(chiusura) != true) {

            System.out.println("Inserisci una parola");
            stringa = input.nextLine();
            System.out.println(" ");

            String[] arrayStringa = stringa.split("");

            for (int i = 0; i < arrayStringa.length; i++){
                risultato = risultato + arrayStringa[i] + v;

            }
            System.out.println(risultato);
            System.out.println(" ");
            risultato = "";

        }

        input.close();
    }
}
