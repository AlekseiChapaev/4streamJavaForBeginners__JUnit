package hw_10;

public class Task_19_ReverseString {

    public String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
