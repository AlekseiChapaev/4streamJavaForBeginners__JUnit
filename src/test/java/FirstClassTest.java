import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstClassTest {

    @Test
    public void testAscendingSequenceHappyPath(){

        FirstClass firstClass = new FirstClass();

        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, firstClass.ascendingSequence(0, 5, 1));

    }



}