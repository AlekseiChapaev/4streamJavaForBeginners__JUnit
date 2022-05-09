package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_5_IsPositiveNumberTest {

    @Test
    public void testIsPositiveTestData1(){
        Task_5_IsPositiveNumber posNum = new Task_5_IsPositiveNumber();
        Assertions.assertTrue(posNum.isPositiveNumber(555));
    }

    @Test
    public void testIsPositiveTestData2(){
        Task_5_IsPositiveNumber posNum = new Task_5_IsPositiveNumber();
        Assertions.assertTrue(posNum.isPositiveNumber(0));
    }

    @Test
    public void testIsPositiveTestData3(){
        Task_5_IsPositiveNumber posNum = new Task_5_IsPositiveNumber();
        Assertions.assertFalse(posNum.isPositiveNumber(-555));
    }
}
