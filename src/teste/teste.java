import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOrdenacao {

    Opcoes opcoes;

    @Test
    public void testMergeSort() {
        opcoes = new SelecaoMergeSort();

        int[] atual = new int [] { 5, 1, 6, 2, 3, 4 };
        int[] esperado = new int [] { 1, 2, 3, 4, 5, 6 };
        int[] array = opcoes.sort(atual, atual.length);
        assertTrue(Arrays.equals(array, expected));
    }

    @Test
    public void testBubbleSort(){
        opcoes = new SelecaoBubbleSort();

        int [] atual = new int [] {3, 7, 8, 1, 5};
        int [] esperado = new int [] {1, 3, 5, 7, 8};

        int[] array = opcoes.sort(atual);
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

        int [] atual = new int [] {3, 7, 8, 1, 5};
        int [] esperado = new int [] {1, 3, 5, 7, 8};

        int[] array = opcoes.sort(atual);
        assertTrue(Arrays.equals(array, arr2));
    }

}