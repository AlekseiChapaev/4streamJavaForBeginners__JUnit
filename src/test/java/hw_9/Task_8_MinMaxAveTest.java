package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_8_MinMaxAveTest {

    @Test
    public void testMinMaxAveTestData(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
            Assertions.assertArrayEquals(new int[]{3, 7, 5}, mnv.getMinMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6));
    }

    @Test
    public void testMinMaxAveNegativeNumbers(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
        Assertions.assertArrayEquals(new int[]{-4, -2, -3}, mnv.getMinMaxAve(new int[]{-1, -2, -3, -4, -5}, 1, 3));
    }

    @Test
    public void testMinMaxAveEmptyArray(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
        Assertions.assertArrayEquals(null, mnv.getMinMaxAve(new int[]{}, 1, 3));
    }

    @Test
    public void testMinMaxAveSameFirstSecondNumbers(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
        Assertions.assertArrayEquals(null, mnv.getMinMaxAve(new int[]{1, 2, 3, 4, 5}, 1, 1));
    }

    @Test
    public void testMinMaxAveSameFirstNumberMoreSecondNumbers(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
        Assertions.assertArrayEquals(null, mnv.getMinMaxAve(new int[]{1, 2, 3, 4, 5}, 4, 1));
    }

    @Test
    public void testMinMaxAveSameFirstNumbersMoreArrayLenght(){
        Task_8_MinMaxAve mnv = new Task_8_MinMaxAve();
        Assertions.assertArrayEquals(null, mnv.getMinMaxAve(new int[]{1, 2, 3, 4, 5}, 6, 8));
    }


}