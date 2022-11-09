public class MergeSort implements Interface{

    @Override
        public static void mergeSort(int[] lista, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = lista[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = lista[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(lista, l, r, mid, n - mid);
        }

        public static void merge(
        int[] lista, int[] l, int[] r, int left, int right) {
        
            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    lista[k++] = l[i++];
                }
                else {
                    lista[k++] = r[j++];
                }
            }
            while (i < left) {
                lista[k++] = l[i++];
            }
            while (j < right) {
                lista[k++] = r[j++];
            }
        }
}