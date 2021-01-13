package Sorts;

public class BubbleSort {
    public static int[] bubbled(int[] arr) {
        //Now input an array
        int i = 0;
        while(i < arr.length - 1) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            i++;
        }
        return arr;
    }

}
