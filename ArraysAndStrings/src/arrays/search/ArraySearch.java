package arrays.search;

/**
 * Created by Dvir on 28/10/2015.
 */
public class ArraySearch {

    public static void main(String[] args) {
        //                     0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15   16
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 20, 40, 55, 60, 700, 1000};
        System.out.println(binarySearch(arr, 7));
    }

    public static int binarySearch(int[] stack, int needle) {
        int midPoint = stack.length / 2;
        if (stack[midPoint] > needle) {
            return binarySearch(stack, needle, 0, midPoint - 1);
        }
        return binarySearch(stack, needle, midPoint, stack.length - 1);
    }

    private static int binarySearch(int[] stack, int needle, int lower, int upper) {

        if (lower > upper) {
            return -1;
        }

        int midPoint = (lower + upper) / 2;
        if (stack[midPoint] < needle) {
            return binarySearch(stack, needle, midPoint+1, upper);
        }
        else if (stack[midPoint] > needle) {
            return binarySearch(stack, needle, lower, midPoint-1);
        }

        return midPoint;
    }
}
