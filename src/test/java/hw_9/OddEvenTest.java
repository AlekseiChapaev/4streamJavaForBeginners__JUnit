package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenTest {

    @Test
     public void testOddNumberHappyPathNegativeNumber(){
        OddEven oddEven = new OddEven();
        Assertions.assertEquals("Odd", oddEven.isNumberOdd(-345));
    }

    @Test
    public void testOddNumberHappyPathZero(){
        OddEven oddEven = new OddEven();
        Assertions.assertEquals("Even", oddEven.isNumberOdd(0));
    }

    @Test
    public void testOddNumberHappyPathPositiveNumber(){
        OddEven oddEven = new OddEven();
        Assertions.assertEquals("Even", oddEven.isNumberOdd(222222));
    }

    @Test
    public void testOddNumberHappyPathMoreMaxInteger(){
        OddEven oddEven = new OddEven();
        Assertions.assertEquals("Undefined", oddEven.isNumberOdd(2147483647 + 1L));
    }

}