package ari.bibliotheque.exceptions;

public class BookDoesNotExistException extends Exception {
    public BookDoesNotExistException() {
        super("This book doesn't exist.");
    }
}
