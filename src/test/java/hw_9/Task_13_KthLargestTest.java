package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_13_KthLargestTest {

    @Test
    public void test(){
        Task_13_KthLargest test = new Task_13_KthLargest();
        Assertions.assertEquals(9, test.KthLargest(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 3));
    }
}