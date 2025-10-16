package br.com.fiap.cp5.application.exception;

public class BookUnsupportedOperation extends  RuntimeException {

    public BookUnsupportedOperation(String message) {
        super(message);
    }
}
