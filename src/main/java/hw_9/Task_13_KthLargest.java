package hw_9;

public class Task_13_KthLargest {

    public int kthLargest(int[] arr, int k){

        if(arr != null && arr.length > 0 && k < arr.length){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            return arr[arr.length - k];
        }

        return 0;
    }
}
