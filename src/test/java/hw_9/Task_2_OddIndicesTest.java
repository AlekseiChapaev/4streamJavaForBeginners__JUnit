package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_2_OddIndicesTest {

    @Test
    public void testOddIndicesHappyPathTestData(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(new int[]{590, 985, 68}, oddIndices.arrayOfOddIndexes(new int[]{-45, 590, 234, 985, 12, 68}));
    }

    @Test
    public void testOddIndicesHappyPathEmptyArray(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(null, oddIndices.arrayOfOddIndexes(new int[]{}));
    }

    @Test
    public void testOddIndicesHappyPathArrayEqualsNull(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(null, oddIndices.arrayOfOddIndexes(null));
    }

    @Test
    public void testOddIndicesHappyPathArrayOneMemberArray(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(null, oddIndices.arrayOfOddIndexes(new int[]{1}));
    }

    @Test
    public void testOddIndicesHappyPathNegativeNumbersArray(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(new int[]{-3, -6}, oddIndices.arrayOfOddIndexes(new int[]{-1, -3, -5, -6}));
    }

    @Test
    public void testOddIndicesHappyPathArithmeticsFunctions(){
        Task_2_OddIndices oddIndices = new Task_2_OddIndices();
        Assertions.assertArrayEquals(new int[]{10, 0, 4, 4}, oddIndices.arrayOfOddIndexes(new int[]{ 2 + 1, -5 + 15, -6, 10 - 10, 8, 2 * 2, 7, 8 / 2}));
    }
}