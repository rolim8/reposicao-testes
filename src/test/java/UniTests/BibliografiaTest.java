package UniTests;


import edu.uni.alu.Aluno;
import edu.uni.bib.Bibliografia;
import edu.uni.bib.Livro;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliografiaTest {

    @Test
    public void testClass_Biblio_AddLivro_Titulo() {
        Bibliografia biblio = new Bibliografia();
        Livro livro = new Livro();

        livro.setTitulo("Test");

        biblio.addLivro(livro);
        assertEquals("Test", biblio.getLivros());
    }

    @Test
    public void testClass_Biblio_addLivro_Isbn() {
        Bibliografia biblio = new Bibliografia();
        Livro livro = new Livro();

        livro.setIsbn("123123123");

        biblio.addLivro(livro);
        assertEquals("123123123", biblio.getLivros());
    }

    @Test
    public void testClass_Biblio_addLivro_NumExemplares() {
        Bibliografia biblio = new Bibliografia();
        Livro livro = new Livro();

        livro.setNumeroExemplares(10);

        biblio.addLivro(livro);
        assertEquals("123123123", biblio.getLivros());
    }
}
