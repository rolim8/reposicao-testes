package UniTests;

import edu.uni.alu.Aluno;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AlunoTest {
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

    //Aluno aluno.getNome
    @Test
    public void testClass_Aluno_nome_Eq() {
        Aluno testClass = new Aluno();

        //----------------- == (EQUALS) -----------------//
        testClass.setNome("Orlando");
        assertEquals("Orlando", testClass.getNome());

        testClass.setNome("Fernanda");
        assertEquals("Fernanda", testClass.getNome());

        testClass.setNome("Maria");
        assertEquals("Maria", testClass.getNome());
    }

    @Test
    public void testClass_Aluno_nome_NEq() {
        Aluno testClass = new Aluno();

        //--------------- != (NOT EQUALS) ---------------//
        testClass.setNome("Orlando");
        assertNotEquals("Ronaldo", testClass.getNome());

        testClass.setNome("Fernanda");
        assertNotEquals("Anna", testClass.getNome());

        testClass.setNome("Maria");
        assertNotEquals("Dora", testClass.getNome());
    }


    //Aluno aluno.getId
    @Test
    public void testClass_Aluno_id_Eq() {
        Aluno testClass = new Aluno();

        //----------------- == (EQUALS) -----------------//
        testClass.setId("O123");
        assertEquals("O123", testClass.getId());

        testClass.setNome("F121");
        assertEquals("F121", testClass.getNome());

        testClass.setNome("M101");
        assertEquals("M101", testClass.getNome());
    }

    @Test
    public void testClass_Aluno_id_NEq() {
        Aluno testClass = new Aluno();

        //--------------- != (NOT EQUALS) ---------------//
        testClass.setId("O123");
        assertNotEquals("0123", testClass.getId());

        testClass.setNome("1101");
        assertNotEquals("I101", testClass.getNome());

        testClass.setNome("7101");
        assertNotEquals("L101", testClass.getNome());
    }
}


