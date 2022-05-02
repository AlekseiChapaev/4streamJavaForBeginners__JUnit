package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_9_IntersectionTest {

    @Test
    public void testIntersectionTestData1(){
        Task_9_Intersection intersection = new Task_9_Intersection();
        Assertions.assertArrayEquals(new int[]{2, 4}, intersection.intersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 4, 2}));
    }

    @Test
    public void testIntersectionTestData2(){
        Task_9_Intersection intersection = new Task_9_Intersection();
        Assertions.assertArrayEquals(new int[]{8, 9}, intersection.intersection(new int[]{1, 2, 4, 5, 8, 9}, new int[]{8, 9, -4, -2}));
    }

    @Test
    public void testIntersectionTestData3(){
        Task_9_Intersection intersection = new Task_9_Intersection();
        Assertions.assertArrayEquals(new int[]{}, intersection.intersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 45}));
    }

    @Test
    public void testIntersectionNullArray(){
        Task_9_Intersection intersection = new Task_9_Intersection();
        Assertions.assertArrayEquals(new int[]{1,3,5}, intersection.intersection(new int[]{1,2,3,4,2,5,3}, new int[]{1,3,7,8,3,5,9,3}));
    }
}
