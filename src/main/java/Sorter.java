public class Sorter {
    public int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public int[] recursiveBubbleSort(int[] array) {
        return bubbleSort(array, array.length);

    }

    private int[] bubbleSort(int[] array, int length) {
        if(length == 1) {
            return array;
        }

        for(int i = 0; i <length-1; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        return bubbleSort(array, length-1);
    }
}
