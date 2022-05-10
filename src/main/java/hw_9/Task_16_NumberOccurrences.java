package hw_9;

public class Task_16_NumberOccurrences {

    public static int findCountUniqueNumbers(int[] arr) {
        int count = 0;
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[i];
        }
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[i] == tempArr[j] && tempArr[j] != Integer.MIN_VALUE) {
                    count++;
                    tempArr[j] = Integer.MIN_VALUE;
                }
            }
        }

        return tempArr.length - count;
    }

    public int[][] numberOccurrences(int[] arr) {

        int index = 0;
        int count = 0;
        int[][] result = new int[findCountUniqueNumbers(arr)][2];

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[i];
        }
        int[] resArr = new int[findCountUniqueNumbers(arr)];
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[i] == tempArr[j] && tempArr[j] != Integer.MIN_VALUE) {
                    tempArr[j] = Integer.MIN_VALUE;
                }
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != Integer.MIN_VALUE) {
                resArr[index++] = tempArr[i];
            }
        }
        for (int i = 0; i < resArr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (resArr[i] == arr[j]) {
                    count++;
                }
            }
            result[i][0] = resArr[i];
            result[i][1] = count;
            count = 0;
        }

        return result;
    }
}
