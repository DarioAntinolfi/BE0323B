import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        System.out.println("Inserisci un intero");
        Scanner input = new Scanner(System.in);
        int valore = input.nextInt();
        System.out.println(" ");
        for (int i = valore; i >= 0; i--){
            System.out.println(i);
        }
        input.close();
    }
}
