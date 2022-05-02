package hw_9;

public class Task_9_Intersection {

    public int[] getUniqueNumbersArray(int[] arr) {
        if (arr != null && arr.length > 0) {
            int countOfNotUniqueNumbersInArray = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && arr[i] != Integer.MIN_VALUE) {
                        countOfNotUniqueNumbersInArray++;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int[] resultArray = new int[arr.length - countOfNotUniqueNumbersInArray];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != Integer.MIN_VALUE){
                    resultArray[index++] = arr[i];
                }
            }
            return resultArray;
        }
        return null;
    }

    public int[] intersection(int[] arr1, int[] arr2) {

        int[] arr1UniqueNumbers = getUniqueNumbersArray(arr1);
        int[] arr2UniqueNumbers = getUniqueNumbersArray(arr2);

        int tempArrlenght = arr1UniqueNumbers.length + arr2UniqueNumbers.length;
        int[] tempArr = new int[tempArrlenght];
        for (int i = 0; i < arr1UniqueNumbers.length; i++) {
            tempArr[i] = arr1UniqueNumbers[i];
        }
        for (int i = 0; i < arr2UniqueNumbers.length; i++) {
            tempArr[arr1UniqueNumbers.length + i] = arr2UniqueNumbers[i];
        }

        int count = 0;
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = i + 1; j < tempArr.length; j++){
                if(tempArr[i] == tempArr[j]){
                    count++;
                }
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = i + 1; j < tempArr.length; j++){
                if(tempArr[i] == tempArr[j] && tempArr[j] != Integer.MIN_VALUE){
                    res[index++] = tempArr[i];
                    tempArr[j] = Integer.MIN_VALUE;
                }
            }
        }

        return res;
    }
}