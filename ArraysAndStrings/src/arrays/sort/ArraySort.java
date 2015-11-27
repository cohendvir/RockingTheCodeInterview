package arrays.sort;

import java.util.Arrays;

/**
 * Created by Dvir on 28/10/2015.
 */
public class ArraySort {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 7, 1, 6, 2, 7, 2, 3, 9, 4, 3, 4, 6, 78, 8, 5,2, 1,2 ,5, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void bubbleSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
