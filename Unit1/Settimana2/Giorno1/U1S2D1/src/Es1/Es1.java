package Es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        int numero;
        int posizione;
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++){
            numeri[i] = (int) (Math.random()*10) +1;
            System.out.println(numeri[i]);
        }

        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli il numero da inserire");
        numero = Integer.valueOf(input.nextLine());
        System.out.println("Scegli la posizione il numero");
        posizione = Integer.valueOf(input.nextLine());
        System.out.println(" ");

        numeri[posizione-1] = numero;
        for (int i = 0; i < numeri.length; i++){
            System.out.println(numeri[i]);
        }

        input.close();
    }

}
