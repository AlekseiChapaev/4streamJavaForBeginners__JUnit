package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_4_BiggerValueTest {

    @Test
    public void testBiggerValueTestData(){
        Task_4_BiggerValue biggerValue = new Task_4_BiggerValue();
        Assertions.assertEquals(9999, biggerValue.biggerValue(3333, 9999));
    }

    @Test
    public void testBiggerValueSameData(){
        Task_4_BiggerValue biggerValue = new Task_4_BiggerValue();
        Assertions.assertEquals(9999, biggerValue.biggerValue(9999, 9999));
    }

    @Test
    public void testBiggerValueNegativeNumbers(){
        Task_4_BiggerValue biggerValue = new Task_4_BiggerValue();
        Assertions.assertEquals(-999, biggerValue.biggerValue(-9999, -999));
    }

    @Test
    public void testBiggerValueZero(){
        Task_4_BiggerValue biggerValue = new Task_4_BiggerValue();
        Assertions.assertEquals(0, biggerValue.biggerValue(0, -999));
    }
}
