package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_16_StringToNumbersTest {

    @Test
    public void testStringToNumbers(){
        Task_16_StringToNumbers test = new Task_16_StringToNumbers();
        Assertions.assertEquals("4565666545", test.stringToNumbers("sdfsdfs dfsdfsd f456 56*/-6kjs  6545jgkGFDG"));
    }
}