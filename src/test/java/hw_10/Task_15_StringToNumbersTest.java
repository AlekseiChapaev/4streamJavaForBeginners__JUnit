package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_15_StringToNumbersTest {

    @Test
    public void stringToNumbersTestDataTest(){
        Task_15_StringToNumbers test = new Task_15_StringToNumbers();
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, test.stringToNumbers("1, 2, 3, 4, 5"));
    }

    @Test
    public void stringToNumbersEmptyStringTest(){
        Task_15_StringToNumbers test = new Task_15_StringToNumbers();
        Assertions.assertArrayEquals(null, test.stringToNumbers(""));
    }

    @Test
    public void stringToNumbersHappyPathTest(){
        Task_15_StringToNumbers test = new Task_15_StringToNumbers();
        Assertions.assertArrayEquals(new int[]{4, 8, 9, 5, 5, 8, 5, 9}, test.stringToNumbers("fojk489gkf5585j9tk"));
    }
}