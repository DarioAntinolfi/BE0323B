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
        

        input.close();
    }
}
