import java.awt.*;

public class SIM {
    int numeroTelefonico;
    double creditoResiduo = 0;
    String[] elencoNomiChiamate = new String[5];
    int[] elencoNumeriChiamate = new int[5];
    double[] elencominutiChiamate = new double[5];

    public void costruttore (int a){
        this.numeroTelefonico = a;
    }
    public void stampaDati () {
        System.out.println(numeroTelefonico);
        System.out.println(creditoResiduo);
        System.out.println(" ");
        for (int i = 0; i < 5 ;i++){
            System.out.println(this.elencoNomiChiamate[i]);
            System.out.println(this.elencoNumeriChiamate[i]);
            System.out.println(this.elencominutiChiamate[i]);
            System.out.println(" ");
        }
    }
}

