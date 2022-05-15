package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_20_RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates(){
        Task_20_RemoveDuplicates test = new Task_20_RemoveDuplicates();
        Assertions.assertEquals("abc", test.removeDuplicates("AABBCCaabbcc"));
    }
}