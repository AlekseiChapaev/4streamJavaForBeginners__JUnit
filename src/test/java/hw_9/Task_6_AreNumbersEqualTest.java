package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_6_AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualTestData1(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(0, numEquals.AreNumbersEqual(89, 89));
    }

    @Test
    public void testAreNumbersEqualTestData2(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(-1, numEquals.AreNumbersEqual(-89, 89));
    }

    @Test
    public void testAreNumbersEqualTestData3(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(1, numEquals.AreNumbersEqual(89, -89));
    }

    @Test
    public void testAreNumbersEqualCheckDoubleZero(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(0, numEquals.AreNumbersEqual(0, 0));
    }

    @Test
    public void testAreNumbersEqualCheckFirstNumberZero(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(-1, numEquals.AreNumbersEqual(0, 10));
    }

    @Test
    public void testAreNumbersEqualCheckSecondNumberZero(){
        Task_6_AreNumbersEqual numEquals = new Task_6_AreNumbersEqual();
        Assertions.assertEquals(1, numEquals.AreNumbersEqual(10, 0));
    }
}
