package hw_10;

public class Task_16_StringToLetters {

    public String StringToLetters(String str){
        if(str.length() > 0) {
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    res += str.charAt(i);
                }
            }

            return res;
        }

        return "Not row";
    }
}
