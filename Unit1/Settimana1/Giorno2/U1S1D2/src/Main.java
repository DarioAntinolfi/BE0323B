import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*-1-*/

        System.out.println("Inserisci una parola");
        String parola = input.nextLine();
        int lunghezza = parola.length();
        if (lunghezza % 2 == 0){
            System.out.println("Pari");
        } else {
            System.out.println("Dispari");
        }

        System.out.println(" ");
        /*-2-*/

        System.out.println("Inserisci un intero");
        int anno = input.nextInt();
        if (anno % 4 == 0) {
            if ((anno % 100 == 0) != (anno % 400 == 0)) {
                System.out.println("Bisestile");
            }
            System.out.println("Non bisestile");
        } else {
            System.out.println("Non bisestile");
        }

        input.close();

    }
}