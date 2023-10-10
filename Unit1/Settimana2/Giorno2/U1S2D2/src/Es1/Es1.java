package Es1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        System.out.println("Crea ArrayList");
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti valori vuoi inserire?");
        int quantità = Integer.parseInt(input.nextLine());
        ArrayList<String> parole = new ArrayList<>();
        for (int i=0; i<quantità; i++){
            System.out.println(" Inserisci parola numero " + (i+1));
            String parola = input.nextLine();
            parole.add(parola);
        }

        System.out.println("Stampa parole duplicate");
        for (int i = 0; i < quantità; i++){
            for(int j = 0; j < i; j++){
                if (Objects.equals(parole.get(j), parole.get(i))){
                    System.out.println(parole.get(j));
                }
            }
        }

        System.out.println("Stampa il numero di parole distinte");
        int numeroParoleDistinte = 0;
        for (int i = 0; i < quantità; i++){
            for(int j = 0; j < i; j++){
                if (Objects.equals(parole.get(j), parole.get(i))){
                    numeroParoleDistinte--;
                }
            }
            numeroParoleDistinte++;
        }
        System.out.println(numeroParoleDistinte);

        System.out.println("Le parole distinte sono: ");
        for (int i = 0; i < quantità; i++){
            int copie=1;
            for(int j = 0; j < i; j++){

                if (Objects.equals(parole.get(j), parole.get(i))){
                    copie++;
                }
            }
            if(copie == 1){
                System.out.println(parole.get(i));
            }
        }

        System.out.println("Fine");
        input.close();
    }
}
