package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_1_OddEvenTest {

    @Test
     public void testOddNumberHappyPathNegativeNumber(){
        Task_1_OddEven oddEven = new Task_1_OddEven();
        Assertions.assertEquals("Odd", oddEven.isNumberOdd(-345));
    }

    @Test
    public void testOddNumberHappyPathZero(){
        Task_1_OddEven oddEven = new Task_1_OddEven();
        Assertions.assertEquals("Even", oddEven.isNumberOdd(0));
    }

    @Test
    public void testOddNumberHappyPathPositiveNumber(){
        Task_1_OddEven oddEven = new Task_1_OddEven();
        Assertions.assertEquals("Even", oddEven.isNumberOdd(222222));
    }

    @Test
    public void testOddNumberHappyPathMoreMaxInteger(){
        Task_1_OddEven oddEven = new Task_1_OddEven();
        Assertions.assertEquals("Undefined", oddEven.isNumberOdd(2147483647 + 1L));
    }

    @Test
    public void testOddNumberNegativeTestWrongData(){
        Task_1_OddEven oddEven = new Task_1_OddEven();
        Assertions.assertNotEquals("Even", oddEven.isNumberOdd(33));
    }



}