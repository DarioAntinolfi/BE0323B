package Es1;

public class ErroreNumero extends Exception {
    public ErroreNumero(String message){
        super("Problema");
        System.out.println("Problema di scelta del numero");
    }
    public ErroreNumero (){
    }
}
