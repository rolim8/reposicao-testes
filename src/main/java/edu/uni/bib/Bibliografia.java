package edu.uni.bib;

import java.util.ArrayList;
import java.util.List;

public class Bibliografia {
  private List<Livro> livros;

  public Bibliografia(){
    this.livros = new ArrayList<>();
  }

  public boolean addLivro(Livro livro){
    if(livro.getNumeroExemplares() > 0){
      this.livros.add(livro);
      return true;
    }
    return false;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }
}
