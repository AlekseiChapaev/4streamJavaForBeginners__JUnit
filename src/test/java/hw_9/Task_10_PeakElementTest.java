package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_10_PeakElementTest {

    @Test
    public void testPeakElement(){
        Task_10_PeakElement test = new Task_10_PeakElement();
        Assertions.assertArrayEquals(new int[]{3, 7, 23}, test.peakElements(new int[]{3, 2, 7, 5, 1, 9, 23, 1}));
    }

}