package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_12_SortArrayTest {

    @Test
    public void test(){
        Task_12_SortArray test = new Task_12_SortArray();
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12}, test.sortArray(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}));
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12}, test.sortArray2(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}));
    }
}