package hw_9;

public class Task_14_NegativeOnTheRight {

    public int[] negativeOnTheRight(int[] arr) {

        if (arr != null && arr.length > 0) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    count++;
                }
            }

            int[] result = new int[arr.length];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    result[index++] = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    result[index++] = arr[i];
                }
            }
            return result;
        }
        return null;
    }
}
