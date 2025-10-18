package br.com.fiap.cp5.application.service;

import br.com.fiap.cp5.application.exception.BookUnsupportedOperation;
import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;
import br.com.fiap.cp5.domain.repository.AuthorRepository;
import br.com.fiap.cp5.domain.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author criar(Author author) {
        try {
            buscarPorID(author.getId_author());
            throw new BookUnsupportedOperation("Livro já cadastrado");
        } catch (EntidadeNaoLocalizada e) {
            return authorRepository.criar(author);
        }
    }

    @Override
    public Author buscarPorID(int id) throws EntidadeNaoLocalizada {
        return authorRepository.buscarPorID(id);
    }

    @Override
    public Author atualizar(Author author) throws EntidadeNaoLocalizada {
        try {
            return authorRepository.atualizar(author);
        } catch (EntidadeNaoLocalizada e) {
            throw new EntidadeNaoLocalizada("O livro que está tentando editar não existe");
        }
    }

    @Override
    public void deletar(int id) throws EntidadeNaoLocalizada {
        try {
            buscarPorID(id);
            authorRepository.deletar(id);
        } catch (EntidadeNaoLocalizada e) {
            throw new EntidadeNaoLocalizada("Livro não localizado");
        }
    }
}
