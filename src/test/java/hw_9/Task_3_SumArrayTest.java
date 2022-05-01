package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_3_SumArrayTest {

    @Test
    public void testSumArrayHappyPathTestData1(){
        Task_3_SumArray sumArray = new Task_3_SumArray();
        Assertions.assertEquals(15, sumArray.getSumArray(new int[]{0, 1, 2, 3, 4, 5}));
    }

    @Test
    public void testSumArrayHappyPathTestData2(){
        Task_3_SumArray sumArray = new Task_3_SumArray();
        Assertions.assertEquals(-10, sumArray.getSumArray(new int[]{-7, -3}));
    }

    @Test
    public void testSumArrayHappyPathEmptyArray(){
        Task_3_SumArray sumArray = new Task_3_SumArray();
        Assertions.assertEquals(0, sumArray.getSumArray(new int[]{}));
    }

    @Test
    public void testSumArrayHappyPathNullArray(){
        Task_3_SumArray sumArray = new Task_3_SumArray();
        Assertions.assertEquals(0, sumArray.getSumArray(null));
    }
}