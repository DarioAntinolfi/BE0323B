public class Main {
    public static void main(String[] args) {
        /*-1-*/

        String parola = "Ciao";
        int lunghezza = parola.length();
        if (lunghezza % 2 == 0){
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }

        /*-2-*/

        int anno = 2023;
        if (anno % 4 == 0) {
            if ((anno % 100 == 0) != (anno % 400 == 0)) {
                System.out.println("bisestile");
            }
            System.out.println("non bisestile");
        } else {
            System.out.println("non bisestile");
        }

    }
}