package hw_9;

public class Task_10_PeakElement {

    public int[] peakElements(int[] arr){
        int count = 0;
        if(arr != null && arr.length > 0){
            if(arr[0] > arr[1]){
                count++;
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    count++;
                }
            }
            if(arr[arr.length - 1] > arr[arr.length - 2]){
                count++;
            }

            int[] resArr = new int[count];
            int index  = 1;
            if(arr[0] > arr[1]){
                resArr[0] = arr[0];
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if(arr[0] > arr[1]){
                    resArr[0] = arr[0];
                }

                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    resArr[index++] = arr[i];
                }
            }
            if(arr[arr.length - 1] > arr[arr.length - 2]){
                resArr[resArr.length - 1] = arr[arr.length - 1];
            }
            return resArr;
        }
        return null;
    }
}
