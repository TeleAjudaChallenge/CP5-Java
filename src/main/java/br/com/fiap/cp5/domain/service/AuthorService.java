package br.com.fiap.cp5.domain.service;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Author;

public interface AuthorService {
    Author criar (Author author);
    Author buscarPorID (int id) throws EntidadeNaoLocalizada;
    Author atualizar (Author author);
    void deletar (int id) throws EntidadeNaoLocalizada;
}
