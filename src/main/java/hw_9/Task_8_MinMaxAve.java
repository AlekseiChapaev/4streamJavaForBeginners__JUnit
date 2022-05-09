package hw_9;

public class Task_8_MinMaxAve {

    public int[] getMinMaxAve(int[] arr, int firstNum, int secondNum) {
        if (arr != null && arr.length > 2 && firstNum < secondNum && firstNum < arr.length && secondNum < arr.length) {

            int min = arr[firstNum];
            int max = arr[secondNum];
            int sum = 0;

            for (int i = firstNum; i <= secondNum; i++) {
                if(min > arr[i]){
                    min = arr[i];
                }
                if(max < arr[i]){
                    max = arr[i];
                }
                sum += arr[i];
            }

            int aver = sum / (secondNum - firstNum + 1);
            int[] resultArray = {min, max, aver};
            return resultArray;
        }

        return null;
    }
}




//            int min = Integer.MAX_VALUE;
//            for (int i = firstNum; i <= secondNum; i++) {
//                if (min > arr[i]) {
//                    min = arr[i];
//                }
//            }
//            resultArray[0] = min;
//
//            int max = Integer.MIN_VALUE;
//            for (int i = firstNum; i <= secondNum; i++) {
//                if (max < arr[i]) {
//                    max = arr[i];
//                }
//            }
//            resultArray[1] = max;
//
//            int temp = 0;
//            int count = 0;
//            for (int i = firstNum; i <= secondNum; i++) {
//                temp += arr[i];
//                count++;
//            }
//            resultArray[2] = temp / count;
//
//            return resultArray;
//        }


