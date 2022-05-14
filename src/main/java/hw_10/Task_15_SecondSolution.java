package hw_10;

import java.util.Arrays;

public class Task_15_SecondSolution {

    public static int[] stringToNumbers(String str) {
        if (str.length() > 0) {
            int count = 0;
            int index = 0;
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 48 && arr[i] <= 57) {
                    count++;
                }
            }

            int[] resArr = new int[count];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    resArr[index] = str.charAt(i) - 48;
                    for (int j = 0; j < str.length() - 1; j++) {
                        if (str.substring(str.charAt(j), str.charAt(j + 1)).contains("-")) {
                            resArr[index] = resArr[index] * -1;
                        }

                    }
                    index++;
                }
            }

//        int[] resArr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] >= 48 && arr[i] <= 57){
//                resArr[index] = arr[i] - 48;
//            }
//            if(String.valueOf(str.substring(arr[i], arr[i + 1]).charAt(0)).contains("-")) {
//                resArr[index] = resArr[index] * -1;
//            }
//            index++;
//        }

            return resArr;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToNumbers("45-7")));
    }
}
