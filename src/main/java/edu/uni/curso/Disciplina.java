package edu.uni.curso;

import edu.uni.alu.Aluno;
import edu.uni.bib.Bibliografia;
import edu.uni.prof.Professor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Disciplina {
  private String nome;
  private Map<Aluno, Nota> alunos;
  private Professor professor;
  private Bibliografia bibliografia;

  public Disciplina(String nome){
    this.nome = nome;
    this.alunos = new HashMap<>();
  }

  public boolean addProfessor(Professor professor){
    if (this.professor == null){
      this.professor = professor;
      return true;
    }
    return false;
  }

  public boolean addAluno(Aluno aluno){
    if (!alunoMatriculado(aluno)){
      this.alunos.put(aluno, new Nota());
      return true;
    }
    return false;
  }

  public boolean addNotaAluno(Aluno aluno, double nota){
    if (alunoMatriculado(aluno)){
      this.alunos.get(aluno).addNota(nota);
      return true;
    }
    return false;
  }

  private boolean alunoMatriculado(Aluno aluno){
    return this.alunos.containsKey(aluno) ? true : false;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Map<Aluno, Nota> getAlunos() {
    return alunos;
  }

  public void setAlunos(Map<Aluno, Nota> alunos) {
    this.alunos = alunos;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Bibliografia getBibliografia() {
    return bibliografia;
  }

  public void setBibliografia(Bibliografia bibliografia) {
    this.bibliografia = bibliografia;
  }
}
