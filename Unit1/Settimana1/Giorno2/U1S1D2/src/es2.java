import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        switch (numero){
            case 0:{
                System.out.println("zero");
                break;
            }
            case 1:{
                System.out.println("uno");
                break;
            }
            case 2:{
                System.out.println("due");
                break;
            }
            case 3:{
                System.out.println("tre");
                break;
            }
            default:{
                System.out.println("errore");
                break;
            }
        }

        input.close();
    }
}
