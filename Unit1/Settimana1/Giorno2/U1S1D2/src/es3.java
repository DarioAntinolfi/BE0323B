import java.util.Scanner;
/*-error-*/
public class es3 {
    public static void main(String[] args) {
        String chiusura = ":q";
        Scanner input = new Scanner(System.in);
        String stringa = "inizio";

        while (stringa != chiusura) {

            stringa = input.nextLine();

            String[] arrayStringa = stringa.split("");

            for (int i = 0; i < arrayStringa.length; i++){
                System.out.println(arrayStringa[i]);

            }

        }
        input.close();
    }
}
