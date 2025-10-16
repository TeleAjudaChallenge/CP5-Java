package br.com.fiap.cp5.infrastructure.logging;


import br.com.fiap.ecopark.domain.logging.Logger;

public final class LoggerFactory {

    private LoggerFactory() {
        super();
    }

    public static Logger getLogger(Class<?> clazz) {
        return new LoggerImpl(clazz);
    }
}
