package Es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) throws ErroreNumero {

        int numero = 1;
        int posizione = 1;
        int[] numeri = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeri.length; i++){
            numeri[i] = (int) (Math.random()*10) +1;
            //System.out.println(numeri[i]);
        }

        try {


            System.out.println(" ");

            System.out.println("Scegli il numero da inserire");
            numero = Integer.valueOf(input.nextLine());
            System.out.println("Scegli la posizione il numero");
            posizione = Integer.valueOf(input.nextLine());
            System.out.println(" ");

            if (0>=numero || numero>10){
                    throw new ErroreNumero();
                } else{
                    if (0> posizione || posizione >= numeri.length){

                    } else {
                        numeri[posizione-1] = numero;
                    }
                }

            } /*catch (Es1.ErrorePosizioneException e) {
            throw new RuntimeException(e);*/
        }


        for (int i = 0; i < numeri.length; i++){
            System.out.println(numeri[i]);
        }

        input.close();
    }



