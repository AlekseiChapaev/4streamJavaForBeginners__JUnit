package hw_9;

import java.util.Arrays;

public class Task_15_SumOfTwo {

    public int[][] sumOfTwo(int[] arr, int num) {
        if (arr != null && arr.length > 0) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == num) {
                        count++;
                    }
                }
            }
            int[][] res = new int[count][2];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == num) {
                       res[index][0] = arr[i];
                       res[index][1] = arr[j];
                       index++;
                    }
                }
            }
            return res;
        }
        return null;

    }

    public static void main(String[] args) {

        int[][] res = new int[2][3];
        System.out.println(Arrays.deepToString(res));
    }
}
