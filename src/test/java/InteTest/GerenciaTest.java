package InteTest;

import edu.uni.alu.Aluno;
import edu.uni.curso.Disciplina;
import edu.uni.curso.Nota;
import edu.uni.ger.Gerencia;
import edu.uni.prof.Professor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GerenciaTest {

    @Mock
    private Gerencia gerencia;
    private Disciplina disciplina;
    private final Logger logger = Logger.getLogger("my-Logger");

    @Before
    public void setUp(){
        this.gerencia = new Gerencia((List<Disciplina>) disciplina);
    }

    @After
    public void printMessage(){
        this.logger.info("Disciplinas : " +this.gerencia.getDisciplinas());
    }

    @Test
    public void verificaProfessorNome(){
        Professor prof = new Professor();
        prof.setNome("Leuson");

        gerencia.setDisciplinas((List<Disciplina>) prof);
        Assert.assertEquals("Leuson", gerencia.getDisciplinas());
    }

    @Test
    public void verificaProfessorTelefone() {
        Professor prof = new Professor();

        prof.setTelefone("1234-1234");

        gerencia.setDisciplinas((List<Disciplina>) prof);
        assertEquals("Leuson", gerencia.getDisciplinas());
    }

    @Test
    public void verificaFullService(){
        gerencia.setDisciplinas(List.of(new Gerencia[]{
                new Gerencia((List<Disciplina>) disciplina),
                new Professor(),
                new Aluno(),
                new Disciplina()
        }));

        gerencia.addDisciplina(disciplina);

        List<Disciplina> isFull = gerencia.getDisciplinas();
        Assert.assertTrue(isFull);
    }

    @Test
    public void verificaEncarregado(){
        Aluno aluno = new Aluno();
        aluno.setNome("José");

        gerencia.setDisciplinas(List.of(new Disciplina[]{
                new Gerencia(),
                new Professor(),
                new Aluno(),
                new Nota()
        }));

        Assert.assertEquals("José", gerencia.getDisciplinas().get(2).getNome());
    }
}
