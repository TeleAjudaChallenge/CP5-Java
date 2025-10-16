package br.com.fiap.cp5.infrastructure.persistence;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Book;
import br.com.fiap.cp5.domain.repository.BookRepository;

public class JdbcBookRepository implements BookRepository {
    private final DatabaseConnection databaseConnection;

    public JdbcBookRepository(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

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
