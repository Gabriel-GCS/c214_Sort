public class BubbleSort implements Interface{

    @Override
    public int[] ordenar(int[] lista) {

        int aux = 0;
        int i = 0;

        for(i = 0; i<lista.length; i++){
            for(int j = 0; j<lista.length-1; j++){
                if(lista[j] > lista[j + 1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
        return lista;
    }
}