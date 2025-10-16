package br.com.fiap.cp5.domain.service;

import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;
import br.com.fiap.cp5.domain.model.Book;

public interface BookService {
    Book criar (Book book);
    Book buscarPorID (int id) throws EntidadeNaoLocalizada;
    Book atualizar (Book book);
    void deletar (int id) throws EntidadeNaoLocalizada;
}
