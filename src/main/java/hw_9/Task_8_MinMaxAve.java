package hw_9;

public class Task_8_MinMaxAve {

    public int[] getMinMaxAve(int[] arr, int firstNum, int secondNum) {
        if (arr != null && arr.length > 1 && firstNum < secondNum && firstNum < arr.length - 2 && secondNum < arr.length - 1) {

            int[] resultArray = new int[3];
            int min = Integer.MAX_VALUE;
            for (int i = firstNum; i <= secondNum; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            resultArray[0] = min;

            int max = Integer.MIN_VALUE;
            for (int i = firstNum; i <= secondNum; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            resultArray[1] = max;

            int temp = 0;
            int count = 0;
            for (int i = firstNum; i <= secondNum; i++) {
                temp += arr[i];
                count++;
            }
            resultArray[2] = temp / count;

            return resultArray;
        }

        return null;
    }
}
