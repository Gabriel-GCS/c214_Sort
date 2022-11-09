import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOrdenacao {

    Opcoes opcoes;

    @Test
    public void positiveTest() {
    int[] actual = { 5, 1, 6, 2, 3, 4 };
    int[] expected = { 1, 2, 3, 4, 5, 6 };
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSort(){
        opcoes = new SelecaoBubbleSort();

        double [] arr1 = new double [] {7, 6, 4, 3, 1};
        double [] arr2 = new double [] {1, 3, 4, 6, 7};

        double[] array = opcoes.sort(arr1);
        assertTrue(Arrays.equals(array, arr2));
    }

    @Test
    public void testeInstanceInsertSort(){
        opcoes = new SelecaoInsertSort();

        assertTrue(opcoes.getSort() instanceof sortInsertSort);
    }

    @Test
    public void testeInsertSort(){
        opcoes = new SelecaoInsertSort();

        double [] arr1 = new double [] {7, 6, 4, 3, 1};
        double [] arr2 = new double [] {1, 3, 4, 6, 7};

        double[] array = opcoes.sort(arr1);
        System.out.println(java.util.Arrays.toString(array));
        System.out.println(java.util.Arrays.toString(arr2));
        assertTrue(Arrays.equals(array, arr2));
    }

}