package hw_10;

public class Task_18_StartsWithLetter {

    public String startsWithLetter(String str, String letter){

        String[] strArr = str.split("[. ]");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            if(String.valueOf(strArr[i].charAt(0)).equalsIgnoreCase(letter)) {
                if (strArr[i].charAt(strArr[i].length() - 1) <= 'a' || strArr[i].charAt(strArr[i].length() - 1) >= 'z') {
                    sb.append(strArr[i].substring(0, strArr[i].length() - 1)).append(",").append(" ");
                } else {
                    sb.append(strArr[i]).append(",").append(" ");
                }
            }
        }

        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}