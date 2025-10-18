package br.com.fiap.cp5.interfaces;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;

public interface AuthorController {
    Author criar (Author author);
    Author buscarPorID (int id) throws EntidadeNaoLocalizada;
    Author atualizar (Author author) throws EntidadeNaoLocalizada;
    void deletar (int id) throws EntidadeNaoLocalizada;
}
