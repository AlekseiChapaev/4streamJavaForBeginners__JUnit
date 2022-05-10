package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_16_NumberOccurrencesTest {

    @Test
    public void test() {
        Task_16_NumberOccurrences test = new Task_16_NumberOccurrences();
        Assertions.assertArrayEquals(new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}, test.numberOccurrences(new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1}));
    }
}