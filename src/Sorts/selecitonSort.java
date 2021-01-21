package Sorts;

public class selecitonSort {
    public static int[] selection(int[] arr) {
        //3 1 2 6 5 0
        for(int i = 0; i < arr.length - 1; i++) {
            int pivot = arr[i];
            int min = arr[i];
            for(int j = i + 1; j < arr.length;j++) {
                min = pivot;
                if(min > arr[j]) {
                    //only the index should be remembered!
                    min = arr[j];
                }
            }
            int temp;
            temp = pivot;
            arr[i] = min;
            min = temp;
        }
        return arr;
    }
    //{3, 1, 2, 6, 5, 0}
    public static int[] selected(int[] arr) {
        for(int i = 0;i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
