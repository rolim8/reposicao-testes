package edu.uni.curso;

import java.util.ArrayList;
import java.util.List;

public class Nota {
  private List<Double> notas;

  public Nota(){
    this.notas = new ArrayList<>();
  }

  public void addNota(double nota){
    this.notas.add(nota);
  }

  public float getMedia(){
    float media = 0;
    for(double nota: notas){
      media += nota;
    }
    return media/notas.size();
  }

  public List<Double> getNotas() {
    return notas;
  }

  public void setNotas(List<Double> notas) {
    this.notas = notas;
  }
}
