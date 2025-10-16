package br.com.fiap.cp5.application.exception;

public class AuthorUnsupportedOperation extends  RuntimeException {

    public AuthorUnsupportedOperation(String message) {
        super(message);
    }
}
