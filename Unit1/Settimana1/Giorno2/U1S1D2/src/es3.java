import java.util.Scanner;
/*-error-*/
public class es3 {
    public static void main(String[] args) {
        String chiusura = ":q";
        Scanner input = new Scanner(System.in);
        String stringa = "inizio";

        while (stringa.equals(chiusura) != true) {

            System.out.println("Inserisci una parola");
            stringa = input.nextLine();
            System.out.println(" ");

            String[] arrayStringa = stringa.split("");

            for (int i = 0; i < arrayStringa.length; i++){
                System.out.println(arrayStringa[i]);

            }
            System.out.println(" ");

        }
        input.close();
    }
}
