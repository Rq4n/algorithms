public class SelectionSort {
    public static Integer selectionSort(int[] arr) {
        int menor = arr[0];
        int menor_indice = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < menor){
                menor = arr[i];
                menor_indice = i;
                return menor_indice;
            }
        }
        return null;
    }
}
