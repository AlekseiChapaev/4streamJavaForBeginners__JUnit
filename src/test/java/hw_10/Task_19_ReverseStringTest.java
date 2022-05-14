package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_19_ReverseStringTest {

    @Test
    public void testReverseString(){
        Task_19_ReverseString test = new Task_19_ReverseString();
        Assertions.assertEquals("arbadacarbA", test.reverseString("Abracadabra"));
    }
}