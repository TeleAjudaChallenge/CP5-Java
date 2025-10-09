package br.com.fiap.cp5-java.infrastructure.exceptions;

public class InfraestruturaException extends  RuntimeException {

    public InfraestruturaException(String message) {
        super(message);
    }

    public InfraestruturaException(String message, Throwable cause) {
        super(message, cause);
    }
}
