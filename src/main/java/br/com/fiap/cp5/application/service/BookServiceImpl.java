package br.com.fiap.cp5.application.service;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Book;
import br.com.fiap.cp5.domain.service.BookService;

public class BookServiceImpl implements BookService {
    @Override
    public Book criar(Book book) {
        return null;
    }

    @Override
    public Book buscarPorID(int id) throws EntidadeNaoLocalizada {
        return null;
    }

    @Override
    public Book atualizar(Book book) {
        return null;
    }

    @Override
    public void deletar(int id) throws EntidadeNaoLocalizada {

    }
}
