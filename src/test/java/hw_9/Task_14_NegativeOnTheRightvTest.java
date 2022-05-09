package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_14_NegativeOnTheRightvTest {

    @Test
    public void test(){
        Task_14_NegativeOnTheRight test = new Task_14_NegativeOnTheRight();
        Assertions.assertArrayEquals(new int[]{4, 7, 5, 9, 4, 12, -3, -12, -2}, test.negativeOnTheRight(new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12}));
    }
}