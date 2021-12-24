package UniTests;

import edu.uni.alu.Aluno;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Setup {
    Aluno aluno;

    @Before
    public void setUp_B() {
        aluno = new Aluno();
    }

    @After
    public void setUp_A() {
        System.out.println(aluno);
    }

    @Test
    public void testAluno_1() {
        aluno.setNome("Orlando");
        assertEquals("Orlando", aluno.getNome());
    }
}
