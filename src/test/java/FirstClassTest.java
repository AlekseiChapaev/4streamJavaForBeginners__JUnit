import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstClassTest {

    @Test
    public void testAscendingSequenceHappyPath(){

        FirstClass firstClass = new FirstClass();

        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, firstClass.ascendingSequence(0, 5, 1));
    }

    @Test
    public void testAscendingSequenceEmptyArray(){

        FirstClass firstClass = new FirstClass();

        Assertions.assertArrayEquals(new int[]{}, firstClass.ascendingSequence(0, 0, 1));
    }

    @Test
    public void testAscendingSequenceNegative1(){

        FirstClass firstClass = new FirstClass();

        Assertions.assertArrayEquals(new int[]{}, firstClass.ascendingSequence(0, 3, -1));
    }

    @Test
    public void testAscendingSequenceNegative2(){

        FirstClass firstClass = new FirstClass();

        Assertions.assertArrayEquals(new int[]{}, firstClass.ascendingSequence(10, 0, 1));
    }
}