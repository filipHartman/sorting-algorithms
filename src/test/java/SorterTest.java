import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    private Sorter sorter;

    @BeforeEach
    void setup() {
        sorter = new Sorter();
    }
    @Test
    void bubbleSort() {
        int[] array = new int[] {2, 9, 6, 1, 8, 7, 4, 0, 5, 3};
        int[] expectedResult = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedResult, sorter.bubbleSort(array));
    }

}