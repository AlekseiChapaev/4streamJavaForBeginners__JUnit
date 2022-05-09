package hw_9;

public class Task_10_PeakElement {

    public int[] peakElements(int[] arr){
        if(arr != null && arr.length > 0){
            for (int i = 1; i < arr.length - 1; i++) {
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){

                }
            }
        }
        return null;
    }
}
