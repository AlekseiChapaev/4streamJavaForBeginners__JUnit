package hw_10;

public class Task_17_CountWords {

    public int countWords(String text, String word) {
        int count = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains(word) && textArray[i].length() <= word.length() + 1) {
                if (textArray[i].charAt(textArray[i].length() - 1) <= 'a' || textArray[i].charAt(textArray[i].length() - 1) >= 'z' || textArray[i].equals(word)) {
                    count++;
                }
            }
        }
        return count;
    }


//    public int countWords(String text, String word){
//        int count = 0;
//        word = word.toLowerCase();
//        String[] textArray = text.split(" ");
//        for (int i = 0; i < textArray.length; i++) {
//            if(textArray[i].toLowerCase().equals(word)){
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {

    }
}
