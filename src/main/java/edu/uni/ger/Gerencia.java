package edu.uni.ger;

import edu.uni.alu.Aluno;
import edu.uni.curso.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class Gerencia {
  private List<Disciplina> disciplinas;

  public Gerencia(List<Disciplina> disciplina){
    this.disciplinas = new ArrayList<>();
  }

  public boolean addDisciplina(Disciplina disciplina){
    if (disciplina.getProfessor() != null){
      this.disciplinas.add(disciplina);
      return true;
    }
    return false;
  }

  public List<Aluno> alunosAprovadosConceitoA(Disciplina disciplina){
    List<Aluno> alunosAprovados = new ArrayList<>();
    for(Aluno aluno: disciplina.getAlunos().keySet()){
      if (disciplina.getAlunos().get(aluno).getMedia() >= 7){
        alunosAprovados.add(aluno);
      }
    }
    return alunosAprovados;
  }

  public List<Disciplina> getDisciplinas() { return disciplinas; }

  public void setDisciplinas(List<Disciplina> disciplinas) { this.disciplinas = disciplinas; }

}
