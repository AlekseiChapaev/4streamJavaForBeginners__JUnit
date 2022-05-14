package hw_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task_17_CountWordsTest {

    @Test
    public void testCountWords(){
        Task_17_CountWords test = new Task_17_CountWords();
        Assertions.assertEquals(5, test.countWords("As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released" +
                " the last zero-cost public update for the legacy version Java 8 LTS in January 2019" +
                " for commercial java use, although it will otherwise still support Java 8 with public" +
                " updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds" +
                " of OpenJDK 8 and 11 that are still receiving security and other upgrades.", "Java"));
    }

    @Test
    public void testCountWords2(){
        Task_17_CountWords test = new Task_17_CountWords();
        Assertions.assertEquals(2, test.countWords("As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released" +
                " the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial" +
                " java use, although it will otherwise still support Java 8 with public updates for personal " +
                "use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that" +
                " are still receiving security and other upgrades.", "version"));
    }
}