package Es2;

import java.util.ArrayList;
import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti valori vuoi?");
        int numeroValori = Integer.parseInt(input.nextLine());
        ArrayList<Integer> valori = new ArrayList<>();
        for(int i = 0; i< numeroValori; i++){
            double passaggio = Math.random() * 100;
            int numero = (int) passaggio ;
            valori.add(numero);
            System.out.println(numero);
        }

        System.out.println("liste al contrario");
        ArrayList<String> parole = new ArrayList<>();
        System.out.println("Quante parole vuoi?");
        int numeroParole = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numeroParole; i++){
            System.out.println("inserisci parola");
            String parola = input.nextLine();
            parole.add(parola);
        }

        System.out.println("Inversione");
        ArrayList<String> paroleInverse = new ArrayList<>();
        for (int i = 0; i < numeroParole; i++){
            paroleInverse.add(parole.get(numeroParole - 1 - i));
            System.out.println(parole.get(numeroParole - 1 - i));
        }

        input.close();
    }

}
