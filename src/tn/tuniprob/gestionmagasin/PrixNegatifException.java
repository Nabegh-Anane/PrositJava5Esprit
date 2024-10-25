package tn.tuniprob.gestionmagasin;

public class PrixNegatifException extends Exception {
    public PrixNegatifException(String message) {
        super(message);
    }
}
