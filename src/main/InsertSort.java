public class OrdenarInsertSort implements Interface{

    @Override
    public int[] ordenar(int[] lista) {
        int j;
        int key;
        int i;

        for (j = 1; j < lista.length; j++)
        {
            key = lista[j];
            for (i = j - 1; (i >= 0) && (lista[i] > key); i--)
            {
                lista[i + 1] = lista[i];
            }
            lista[i + 1] = key;
        }

        return lista;
    }
}