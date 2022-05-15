package hw_10;

public class Task_19_ReverseString_SecondSolution {

    public String reverseString(String str){
        String newStr = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }

        return newStr;
    }
}
