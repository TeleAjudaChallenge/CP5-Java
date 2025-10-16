package br.com.fiap.cp5.interfaces;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;

public class AuthorControllerImpl implements  AuthorController{
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
