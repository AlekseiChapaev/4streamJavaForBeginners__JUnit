package hw_10;

public class Task_16_StringToNumbersAndSpaces {

    public String stringToNumbersAndSpaces(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' '){
                res += str.charAt(i);
            }
        }
        return res;
    }
}
