package hw_10;

public class Task_16_StringToNumbers {

    public String stringToNumbers(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                res += str.charAt(i);
            }
        }
        return res;
    }
}
