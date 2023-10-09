package Es1;

public class ErrorePosizioneException extends Exception {
    public ErrorePosizioneException(String message){
        super("Problema");
        System.out.println("Problema di scelta della posizione");
    }
    public ErrorePosizioneException (){
    }
}