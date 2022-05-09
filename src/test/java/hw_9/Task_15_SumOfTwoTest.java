package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_15_SumOfTwoTest {

    @Test
    public void test(){
        Task_15_SumOfTwo test = new Task_15_SumOfTwo();
        Assertions.assertArrayEquals(new int[][]{{3, 9}, {7, 5}}, test.sumOfTwo(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 12));
    }

}