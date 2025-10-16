package br.com.fiap.cp5.application.service;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;
import br.com.fiap.cp5.domain.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {
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
