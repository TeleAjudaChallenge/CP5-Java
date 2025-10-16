package br.com.fiap.cp5.domain.repository;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;


public interface AuthorRepository {
    Author criar (Author author);
    Author buscarPorID (int id) throws EntidadeNaoLocalizada;
    Author atualizar (Author author);
    void deletar (int id) throws EntidadeNaoLocalizada;
}
