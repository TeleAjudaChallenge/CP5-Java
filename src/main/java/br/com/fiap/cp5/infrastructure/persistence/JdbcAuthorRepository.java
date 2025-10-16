package br.com.fiap.cp5.infrastructure.persistence;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;
import br.com.fiap.cp5.domain.repository.AuthorRepository;

public class JdbcAuthorRepository implements AuthorRepository {

    private final DatabaseConnection databaseConnection;

    public JdbcAuthorRepository(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public Author criar(Author author) {
        return null;
    }

    @Override
    public Author buscarPorID(int id) throws EntidadeNaoLocalizada {
        return null;
    }

    @Override
    public Author atualizar(Author author) {
        return null;
    }

    @Override
    public void deletar(int id) throws EntidadeNaoLocalizada {

    }
}
