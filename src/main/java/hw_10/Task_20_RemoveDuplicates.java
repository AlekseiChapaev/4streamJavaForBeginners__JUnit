package hw_10;

public class Task_20_RemoveDuplicates {

    public String removeDuplicates(String str){
        str = str.toLowerCase();
        String[] strArr = str.split("");
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if(strArr[i].equals(strArr[j]) && !strArr[j].equals("0")){
                    strArr[j] = "0";
                }
            }
        }
        String res = "";
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("0")){
                res += strArr[i];
            }
        }

        return res;
    }
}
