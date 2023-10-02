// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*-1-*/

        int x = 2, y = 5;
        int z = x * y;
        System.out.println(z);

        /*-2-*/

        int a = 5;
        String b = "ciao";
        String c = Integer.toString(a);
        String d = b + " " + c;
        System.out.println(d);

        /*-3-*/

        String[] lettere = {"a", "b", "c", "d", "e"};
        String[] lettere2 = new String [6];
        lettere2[0] = lettere[0];
        lettere2[1] = lettere[1];
        lettere2[2] = "none";
        lettere2[3] = lettere[2];
        lettere2[4] = lettere[3];
        lettere2[5] = lettere[4];

        for (int i = 0; i < lettere2.length; i++){
            System.out.println(lettere2[i]);
        }

    }
}