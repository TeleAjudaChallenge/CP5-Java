package br.com.fiap.cp5.infrastructure.api.rest;

import br.com.fiap.cp5.domain.model.Book;
import br.com.fiap.cp5.infrastructure.exceptions.InfraestruturaException;
import br.com.fiap.cp5.interfaces.BookController;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import br.com.fiap.cp5.domain.exceptions.EntidadeNaoLocalizada;

import java.util.List;

@Path("/books")
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

    @GET
    @Path("/{id}")
    public Response buscarPorId(@PathParam("id") int id){
        try{
            Book book = this.bookController.buscarPorID(id);
            return Response.ok(book).build();
        } catch (EntidadeNaoLocalizada e){
            return Response.status(Response.Status.NOT_FOUND).build(); // 404 só quando realmente não existe
        } catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build(); // 500 pros demais erros
        }
    }

    @PUT
    public Response atualizar(Book bookInput) {
        try {
            Book book = this.bookController.atualizar(bookInput);
            return Response.status(Response.Status.ACCEPTED).entity(book).build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (EntidadeNaoLocalizada e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") int id) {
        try {
            this.bookController.deletar(id);
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (EntidadeNaoLocalizada e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/authors/{id}/books")
    public Response buscarBooksPorAuthor(@PathParam("id") int id){
        try {
            List<Book> book = this.bookController.buscarBooksPorAuthor(id);
            return Response.ok(book).build();
        } catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }




}
