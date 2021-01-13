import Sorts.*;

import java.util.Arrays;

public class Consoles {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 6, 5, 0};
        //BubbleSort.bubbled(array);
        //InsertionSort.insert(array);
        selecitonSort.selected(array);
        System.out.println(Arrays.toString(array));
    }
}
