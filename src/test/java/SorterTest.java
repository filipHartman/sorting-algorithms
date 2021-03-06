import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    private Sorter sorter = new Sorter();

    @Test
    void bubbleSort() {
        int[] array = new int[] {2, 9, 6, 1, 8, 7, 4, 0, 5, 3};
        int[] expectedResult = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedResult, sorter.bubbleSort(array));
    }

    @Test
    void recursiveBubbleSort() {
        int [] array = new int[] {12, 19, 16, 11, 18, 17, 14, 10, 15, 13};
        int[] expectedResult = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        assertArrayEquals(expectedResult, sorter.recursiveBubbleSort(array));
    }

    @Test
    void insertSort() {
        int[] array = new int[] {2, 9, 6, 1, 8, 7, 4, 0, 5, 3};
        int[] expectedResult = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedResult, sorter.insertionSort(array));
    }

    @Test
    void recursiveInsertionSort() {
        int[] array = new int[] {84, 82, 87, 89, 85, 85, 81};
        int[] expectedResult = new int[] {81, 82, 84, 85, 85, 87, 89};
        sorter.recursiveInsertionSort(array);
        assertArrayEquals(expectedResult, array);
    }
}