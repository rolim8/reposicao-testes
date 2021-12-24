package edu.uni.bib;

public class Livro {
  private String titulo;
  private String isbn;
  private int numeroExemplares;

  public void addExemplar(){
    this.numeroExemplares++;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getNumeroExemplares() {
    return numeroExemplares;
  }

  public void setNumeroExemplares(int numeroExemplares) {
    this.numeroExemplares = numeroExemplares;
  }
}
