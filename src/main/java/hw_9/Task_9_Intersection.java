package hw_9;

public class Task_9_Intersection {

    public static int[] getNotUniqueNumbersArray(int[] arr) {
        if (arr != null && arr.length > 0) {
            int[] tempArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                tempArray[i] = arr[i];
            }

            int countOfNotUniqueNumbersInArray = 0;
            for (int i = 0; i < tempArray.length; i++) {
                for (int j = i + 1; j < tempArray.length; j++) {
                    if(tempArray[i] == tempArray[j] && tempArray[j] != Integer.MIN_VALUE){
                        countOfNotUniqueNumbersInArray++;
                        tempArray[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int[] notUniqueArr = new int[countOfNotUniqueNumbersInArray];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        notUniqueArr[index++] = arr[i];
                    }
                }
            }

            return notUniqueArr;
        }

        return null;
        }

    public static int[] getUniqueNumbersArray(int[] arr) {
        if (arr != null && arr.length > 0) {
            int[] tempArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                tempArray[i] = arr[i];
            }

            int countOfNotUniqueNumbersInArray = 0;
            for (int i = 0; i < tempArray.length; i++) {
                for (int j = i + 1; j < tempArray.length; j++) {
                    if(tempArray[i] == tempArray[j] && tempArray[j] != Integer.MIN_VALUE){
                        countOfNotUniqueNumbersInArray++;
                        tempArray[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int[] uniqueArr = new int[arr.length - countOfNotUniqueNumbersInArray];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != Integer.MIN_VALUE){
                    uniqueArr[index++] = arr[i];
                }
            }

            return uniqueArr;
        }

        return null;
    }

    public int[] intersection(int[] arr1, int[] arr2) {

        int[] arr1UniqueNumbers = getUniqueNumbersArray(arr1);
        int[] arr2UniqueNumbers = getUniqueNumbersArray(arr2);

        int[] tempArr = new int[arr1UniqueNumbers.length + arr2UniqueNumbers.length];
        for (int i = 0; i < arr1UniqueNumbers.length; i++) {
            tempArr[i] = arr1UniqueNumbers[i];
        }
        for (int i = 0; i < arr2UniqueNumbers.length; i++) {
            tempArr[arr1UniqueNumbers.length + i] = arr2UniqueNumbers[i];
        }

        return getNotUniqueNumbersArray(tempArr);
    }
}