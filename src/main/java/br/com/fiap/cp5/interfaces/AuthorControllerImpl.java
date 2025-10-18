package br.com.fiap.cp5.interfaces;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;
import br.com.fiap.cp5.domain.repository.AuthorRepository;
import br.com.fiap.cp5.domain.service.AuthorService;

public class AuthorControllerImpl implements  AuthorController{

    private final AuthorService authorService;

    public AuthorControllerImpl(AuthorService authorService) {
        this.authorService = authorService;
    }


    @Override
    public Author criar(Author authorImput) {
        return this.authorService.criar(authorImput);
    }

    @Override
    public Author buscarPorID(int id) throws EntidadeNaoLocalizada {
        return this.authorService.buscarPorID(id);
    }

    @Override
    public Author atualizar(Author authorImput) throws EntidadeNaoLocalizada {
        return this.authorService.atualizar(authorImput);
    }

    @Override
    public void deletar(int id) throws EntidadeNaoLocalizada {
        this.authorService.deletar(id);
    }
}
