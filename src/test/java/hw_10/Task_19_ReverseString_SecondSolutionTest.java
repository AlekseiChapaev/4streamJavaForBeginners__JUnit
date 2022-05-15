package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_19_ReverseString_SecondSolutionTest {

    @Test
    public void testReverseString() {
        Task_19_ReverseString_SecondSolution test = new Task_19_ReverseString_SecondSolution();
        Assertions.assertEquals("arbadacarbA", test.reverseString("Abracadabra"));
    }
}