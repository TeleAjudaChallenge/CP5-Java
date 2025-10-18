package br.com.fiap.cp5.infrastructure.config;

import br.com.fiap.cp5.domain.service.AuthorService;
import br.com.fiap.cp5.interfaces.AuthorController;
import br.com.fiap.cp5.interfaces.AuthorControllerImpl;
import br.com.fiap.cp5.domain.service.BookService;
import br.com.fiap.cp5.interfaces.BookController;
import br.com.fiap.cp5.interfaces.BookControllerImpl;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ControllerConfig {

    @ApplicationScoped
    public AuthorController authorController(AuthorService authorService) {
        return new AuthorControllerImpl(authorService);
    }

    @ApplicationScoped
    public BookController bookController(BookService bookService) {
        return new BookControllerImpl(bookService);
    }

}
