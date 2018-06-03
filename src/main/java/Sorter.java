public class Sorter {

    // Method that sort integers using bubble sort implemented using double 'for' loops
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

    // Method that sort integers using bubble sort implemented using recursive strategy
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

    // Method that sort integers using insertion sort implemented using two loops
    public int[] insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }

    // Method that sort integers using insertion sort implemented using recursive strategy
    public int[] recursiveInsertionSort(int[] array) {
        return insertionSort(array, array.length);
    }

    private int[] insertionSort(int[] array, int length) {
        if(length == 1) {
            return array;
        }

        return array;
    }
}
