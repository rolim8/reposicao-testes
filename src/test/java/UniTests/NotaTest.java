package UniTests;

import edu.uni.curso.Nota;
import net.bytebuddy.matcher.ElementMatcher;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Every.everyItem;
import static org.junit.Assert.assertThat;


public class NotaTest {

    @Test
    public void checkValue_Test(){
        List<Double> actual = Arrays.asList(10.0, 9.0, 8.8);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.8);

        //1. Check lista tem esse valor especifico
        assertThat(actual, hasItems(10.0));

    }


    @Test
    public void check_listSize_Test(){
        List<Double> actual = Arrays.asList(10.0, 9.0, 8.8);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.8);

        //2. Check tamanho da lista
        assertThat(actual, hasSize(3));
        assertThat(actual.size(), is(3));

    }


    @Test
    public void check_listOrder_Test(){
        List<Double> actual = Arrays.asList(10.0, 9.0, 8.8);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.8);

        //3. Contem na Lista
        assertThat(actual, contains(10.0, 9.0, 8.8));                  // Ordem correta
        assertThat(actual, containsInAnyOrder(8.8, 10.0, 9.0)); // Qualquer ordem

    }


    @Test
    public void check_emptyList_Test(){
        List<Double> actual = Arrays.asList(10.0, 9.0, 8.8);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.8);

        //4. Test check lista vazia
        assertThat(actual, not(IsEmptyCollection.empty()));
        assertThat(new ArrayList<>(), IsEmptyCollection.empty());

    }

    @Test
    public void check_NumCompare_Test(){
        List<Double> actual = Arrays.asList(10.0, 9.0, 8.8);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.8);

        //5. Test Comparação Numérica
        assertThat(actual, everyItem(greaterThanOrEqualTo(3.0)));
        assertThat(actual, everyItem(lessThanOrEqualTo(10.0)));

    }
}
