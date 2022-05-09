package hw_9;

import java.util.Arrays;

public class Task_12_SortArray {

    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public int[] sortArray2(int[] array) {

        if ( array != null && array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i] > array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            return array;
        }

        return null;
    }
}