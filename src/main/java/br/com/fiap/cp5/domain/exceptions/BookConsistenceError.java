package br.com.fiap.cp5.domain.exceptions;

public class BookConsistenceError extends Exception {

    public BookConsistenceError() {
        super();
    }

    public BookConsistenceError(String message) {
        super(message);
    }
}
