package ari.bibliotheque.exceptions;

public class ReaderDoesNotExistException extends Exception {
    public ReaderDoesNotExistException() {
        super("This reader doesn't exist.");
    }
}
