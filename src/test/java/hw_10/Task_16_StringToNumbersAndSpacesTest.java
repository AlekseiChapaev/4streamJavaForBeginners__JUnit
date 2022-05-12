package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_16_StringToNumbersAndSpacesTest {

    @Test
    public void testStringToNumbersAndSpaces(){
        Task_16_StringToNumbersAndSpaces test = new Task_16_StringToNumbersAndSpaces();
        Assertions.assertEquals("  456 566  6545", test.stringToNumbersAndSpaces("sdfsdfs dfsdfsd f456 56*/-6kjs  6545jgkGFDG"));
    }
}