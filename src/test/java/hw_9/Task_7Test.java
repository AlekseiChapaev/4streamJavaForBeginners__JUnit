package hw_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_7Test {

    @Test
    public void testActionsWithNumberGN(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("Good Number", task.actionsWithNumber(15));
    }

    @Test
    public void testActionsWithNumberBN(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("Bad Number", task.actionsWithNumber(9));
    }

    @Test
    public void testActionsWithNumberPN(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("Poor Number", task.actionsWithNumber(10));
    }

    @Test
    public void testActionsWithNumberOverNumber(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("-1", task.actionsWithNumber(1));
    }

    @Test
    public void testActionsWithNumberNegativeNumber(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("Good Number", task.actionsWithNumber(-90));
    }

    @Test
    public void testActionsWithNumberZero(){
        Task_7 task = new Task_7();
        Assertions.assertEquals("Good Number", task.actionsWithNumber(-90));
    }
}