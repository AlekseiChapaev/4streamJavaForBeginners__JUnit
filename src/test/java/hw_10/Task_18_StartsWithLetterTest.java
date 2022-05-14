package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_18_StartsWithLetterTest {

    @Test
    public void testStartsWithLetter(){
        Task_18_StartsWithLetter test = new Task_18_StartsWithLetter();
        Assertions.assertEquals("lame, love, lame, live, Look", test.startsWithLetter(
                "As a decrepit father takes delight" +
                "To see his active child do deeds of youth," +
                "So I, made lame by fortune’s dearest spite," +
                "Take all my comfort of thy worth and truth." +
                "For whether beauty, birth, or wealth, or wit," +
                "Or any of these all, or all, or more," +
                "Entitled in thy parts do crownèd sit," +
                "I make my love engrafted to this store." +
                "So then I am not lame, poor, nor despised," +
                "Whilst that this shadow doth such substance give"+
                "That I in thy abundance am sufficed," +
                "And by a part of all thy glory live." +
                "Look what is best, that best I wish in thee." +
                "This wish I have; then ten times happy me.", "l"));
    }
}