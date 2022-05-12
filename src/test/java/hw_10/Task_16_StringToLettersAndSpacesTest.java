package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_16_StringToLettersAndSpacesTest {

    @Test
    public void testStringToLettersAndSpaces(){
        Task_16_StringToLettersAndSpaces test = new Task_16_StringToLettersAndSpaces();
        Assertions.assertEquals("sdfsdfs dfsdfsd f kjs  jgkGFDG", test.stringToLettersAndSpaces("sdfsdfs dfsdfsd f456 56*/-6kjs  6545jgkGFDG"));
    }
}