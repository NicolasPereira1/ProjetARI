package ari.bibliotheque.exceptions;

public class AuthorDoesNotExistException extends Exception {
    public AuthorDoesNotExistException() {
        super("This author doesn't exist.");
    }
}
