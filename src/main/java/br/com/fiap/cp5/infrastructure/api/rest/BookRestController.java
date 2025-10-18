package br.com.fiap.cp5.infrastructure.api.rest;

import br.com.fiap.cp5.domain.model.Author;
import br.com.fiap.cp5.domain.model.Book;
import br.com.fiap.cp5.interfaces.BookController;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;

@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRestController {

    private final BookController bookController;

    @Inject
    public BookRestController(BookController bookController) {
        this.bookController = bookController;
    }

    @POST
    public Response criar(Book bookInput){
        try{
            Book book = this.bookController.criar(bookInput);
            return Response.status(Response.Status.CREATED).entity(book).build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }



}
