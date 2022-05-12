package hw_10;

public class Task_16_StringToLettersAndSpaces {

    public String stringToLettersAndSpaces(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) == ' ' ){
                res += str.charAt(i);
            }
        }
        return res;
    }
}
