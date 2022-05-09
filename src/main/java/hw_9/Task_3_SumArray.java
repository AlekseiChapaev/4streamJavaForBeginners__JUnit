package hw_9;

public class Task_3_SumArray {

    public int getSumArray(int[] arr) {
        if (arr != null && arr.length > 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            return sum;
        }

        return 0;
    }
}
