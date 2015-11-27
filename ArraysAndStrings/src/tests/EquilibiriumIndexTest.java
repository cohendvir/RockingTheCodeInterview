package tests;

/**
 * Created by Dvir on 13/11/2015.
 */
public class EquilibiriumIndexTest {

    public int solution(int[] A) {

        for (int i = 1; i < A.length; i++) {
            int low = sum(A, 0, i);
            int high = sum(A, i+1, A.length);

            if (low == high) {
                return i;
            }
        }

        return -1;
    }

    private int sum(int[] A, int lowIndex, int highIndex) {

        int sum = 0;
        for (int i = lowIndex; i < highIndex; i++) {
            sum += A[i];
        }
        return sum;
    }
}
