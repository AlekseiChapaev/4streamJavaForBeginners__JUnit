package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_11_ReverseArrayTest {

    @Test
    public void test(){
        Task_11_ReverseArray test = new Task_11_ReverseArray();
        Assertions.assertArrayEquals(new int[]{10, 3, 7, 2}, test.reverseArray(new int[]{2, 7, 3, 10}));
    }
}
