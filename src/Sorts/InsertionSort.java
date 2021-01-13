package Sorts;

public class InsertionSort {
    public static int[] insert(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int preIndex = i - 1;
            //the loop will run from left to right according to the assertion
            while(preIndex >= 0 && arr[preIndex] > temp) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = temp;
        }
        return arr;
    }
}
