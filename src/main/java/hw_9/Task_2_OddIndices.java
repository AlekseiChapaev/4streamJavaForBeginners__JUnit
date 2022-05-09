package hw_9;

public class Task_2_OddIndices {

    public int[] arrayOfOddIndexes(int[] arr) {
        if (arr != null && arr.length > 0) {
            if (arr.length % 2 == 0) {
                int[] newArray = new int[arr.length / 2];
                int index = 0;
                for (int i = 1; i < arr.length; i += 2) {
                    newArray[index++] = arr[i];
                }

                return newArray;
            }
        }

        return null;
    }
}
