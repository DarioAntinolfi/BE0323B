import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner parole = new Scanner(System.in);

        System.out.println("parola 1");
        String p1 = parole.nextLine();

        System.out.println("parola 2");
        String p2 = parole.nextLine();

        System.out.println("parola 3");
        String p3 = parole.nextLine();

        System.out.println(p3 + " " + p2 + " " + p1);

        parole.close();
    }
}
