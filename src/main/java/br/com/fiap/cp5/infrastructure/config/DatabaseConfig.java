package br.com.fiap.cp5.infrastructure.config;
import br.com.fiap.cp5.domain.repository.AuthorRepository;
import br.com.fiap.cp5.domain.repository.BookRepository;
import br.com.fiap.cp5.infrastructure.persistence.DatabaseConnection;
import br.com.fiap.cp5.infrastructure.persistence.DatabaseConnectionImpl;
import br.com.fiap.cp5.infrastructure.persistence.JdbcAuthorRepository;
import br.com.fiap.cp5.infrastructure.persistence.JdbcBookRepository;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DatabaseConfig {

    @ApplicationScoped
    public DatabaseConnection databaseConnection(AgroalDataSource dataSource) {
        return new DatabaseConnectionImpl(dataSource);
    }

    @ApplicationScoped
    public BookRepository bookRepository(DatabaseConnection databaseConnection) {
        return new JdbcBookRepository(databaseConnection);
    }

    @ApplicationScoped
    public AuthorRepository authorRepository(DatabaseConnection databaseConnection) {
        return new JdbcAuthorRepository(databaseConnection);
    }
}
