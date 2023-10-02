public class es3 {
    public static void main(String[] args) {
        /*-1-*/

        double lato1 = 5;
        double lato2 = 7.6;
        double perimetroRettangolo = (2 * lato1) + (2 * lato2);
        System.out.println("il perimetro è " + perimetroRettangolo);

        /*-2-*/

        int numero = 14;
        boolean pariDispari = false;
        if (numero % 2 == 0) {
            pariDispari = true;
        }
        System.out.println(pariDispari);

        /*-3-*/

        double l1 = 3.6;
        double l2 = 4.7;
        double l3 = 5.2;
        double sp = (l1 + l2 + l3)/2;
        double Area = Math.sqrt(sp * (sp - l1) * (sp - l2) * (sp - l3));
        System.out.println("L'area è " + Area);




    }
}
