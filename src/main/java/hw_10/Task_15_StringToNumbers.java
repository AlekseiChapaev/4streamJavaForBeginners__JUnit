package hw_10;

public class Task_15_StringToNumbers {

    public int[] stringToNumbers(String str){
        if(str.length() > 0){
            int count = 0;
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                    count++;
                }
            }
            int[] resArr = new int[count];
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                    resArr[index++] = str.charAt(i) - 48;
                }
            }

            return resArr;
        }

        return null;
    }
}
