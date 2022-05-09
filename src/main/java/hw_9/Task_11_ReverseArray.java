package hw_9;

public class Task_11_ReverseArray {

    public int[] reverseArray(int[] arr){

        int[] resArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[(arr.length - 1) - i];
        }
        return resArr;
    }
}
