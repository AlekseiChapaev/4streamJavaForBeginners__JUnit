package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task_10_StringToNumbersTest {

    @Test
    public void stringToNumbersTestDataTest(){
        Task_10_StringToNumbers test = new Task_10_StringToNumbers();
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, test.stringToNumbers("1, 2, 3, 4, 5"));
    }

    @Test
    public void stringToNumbersEmptyStringTest(){
        Task_10_StringToNumbers test = new Task_10_StringToNumbers();
        Assertions.assertArrayEquals(null, test.stringToNumbers(""));
    }

    @Test
    public void stringToNumbersHappyPathTest(){
        Task_10_StringToNumbers test = new Task_10_StringToNumbers();
        Assertions.assertArrayEquals(new int[]{1, 2, 8, 7, 4, 5, 9, 3, 5, 9, 9}, test.stringToNumbers("12kfdjdfn874593fdgdfldjfnssfg5+99"));
    }
}