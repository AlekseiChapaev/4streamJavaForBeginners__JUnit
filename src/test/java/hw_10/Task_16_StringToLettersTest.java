package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_16_StringToLettersTest {

    @Test
    public void testStringToLetters(){
        Task_16_StringToLetters test1 = new Task_16_StringToLetters();
        Assertions.assertEquals("sdfsdfsdfsdfsdfkjsjgkGFDG", test1.StringToLetters("sdfsdfs dfsdfsd f456 56*/-6kjs  6545jgkGFDG"));
    }

    @Test
    public void testStringToLettersEmptyRow(){
        Task_16_StringToLetters test1 = new Task_16_StringToLetters();
        Assertions.assertEquals("Not row", test1.StringToLetters(""));
    }

}