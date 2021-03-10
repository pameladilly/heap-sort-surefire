import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HeapSortTest {


    @Test
    @DisplayName("Números positivos")
    public void numeroPositivosTest() {


        List<Integer> elements = new ArrayList<Integer>();
        elements.add(3);
        elements.add(5);
        elements.add(1);
        elements.add(4);
        elements.add(2);

        List<Integer> result = Heap.sort(elements);


        Assertions.assertEquals(result.get(0), 1);
        Assertions.assertEquals(result.get(1), 2);
        Assertions.assertEquals(result.get(2), 3);
        Assertions.assertEquals(result.get(3), 4);
        Assertions.assertEquals(result.get(4), 5);

    }

    @Test
    @DisplayName("Números positivos e negativos")
    public void numeroPositivosENegativosTest(){

        List<Integer> elements = new ArrayList<Integer>();
        elements.add(-13);
        elements.add(5);
        elements.add(-1);
        elements.add(0);
        elements.add(19);

        List<Integer> result = Heap.sort(elements);


        Assertions.assertEquals(result.get(0), -13);
        Assertions.assertEquals(result.get(1), -1);
        Assertions.assertEquals(result.get(2), 0);
        Assertions.assertEquals(result.get(3), 5);
        Assertions.assertEquals(result.get(4), 19);
    }

    @Test
    @DisplayName("Números com ponto flutuante")
    public void numeroComPontoFlutuanteTest(){

        List<Double> elements = new ArrayList<Double>();
        elements.add(-139.90);
        elements.add(5.91);
        elements.add(-1.1);
        elements.add(1982.89);
        elements.add(1982.899);
        elements.add(1982.90);

        List<Double> result = Heap.sort(elements);

        Assertions.assertEquals(result.get(0), -139.90);
        Assertions.assertEquals(result.get(1), -1.1);
        Assertions.assertEquals(result.get(2), 5.91);
        Assertions.assertEquals(result.get(3), 1982.89);
        Assertions.assertEquals(result.get(4), 1982.899);
        Assertions.assertEquals(result.get(5), 1982.90);
    }

    @Test
    @DisplayName("Números repetidos")
    public void numerosRepetidosTest(){

        List<Integer> elements = new ArrayList<Integer>();
        elements.add(-82727);
        elements.add(-827271);
        elements.add(0);
        elements.add(812737);
        elements.add(812737);

        List<Integer> result = Heap.sort(elements);


        Assertions.assertEquals(result.get(0), -827271);
        Assertions.assertEquals(result.get(1), -82727);
        Assertions.assertEquals(result.get(2), 0);
        Assertions.assertEquals(result.get(3), 812737);
        Assertions.assertEquals(result.get(4), 812737);

    }
}
