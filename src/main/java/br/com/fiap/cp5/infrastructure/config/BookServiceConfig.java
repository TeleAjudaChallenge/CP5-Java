package br.com.fiap.cp5.infrastructure.config;

import br.com.fiap.cp5.application.service.BookServiceImpl;
import br.com.fiap.cp5.domain.repository.BookRepository;
import br.com.fiap.cp5.domain.service.BookService;
import br.com.fiap.cp5.infrastructure.logging.LoggerFactory;
import jakarta.enterprise.context.RequestScoped;
import br.com.fiap.cp5.domain.logging.Logger;

public class BookServiceConfig {
    private final BookRepository bookRepository;


    public BookServiceConfig(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestScoped
    public BookService contratoService() {
        final Logger logger = LoggerFactory.getLogger(this.getClass());
        return new BookServiceImpl(bookRepository, logger);
    }
}
