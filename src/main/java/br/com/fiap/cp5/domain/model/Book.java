package br.com.fiap.cp5.domain.model;

public class Book {
    private int id;
    private String title;
    private String isbn;
    private int authorId;

    public Book(int id, String title, String isbn, int authorId) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authorId = authorId;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public int getAuthorId() {return authorId;}
    public void setAuthorId(int authorId) {this.authorId = authorId;}

}
