package hw_10;

public class Task_17_CountWords {

    public int countWords(String text, String word){
        int count = 0;
        word = word.toLowerCase();
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i].toLowerCase().equals(word)){
                count++;
            }
        }
        return count;
    }
}
