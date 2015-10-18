package test.chapter1;

import chapter1.Question1_7;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_7_Test {

    @Test
    public void testReset() {

        int matrix[][] = { {1, 2, 3, 4}, { 5, 0, 7, 8}, {9, 0, 11, 12} };
        int M = 3;
        int N = 4;

        int [][] exp = { {1, 0, 3, 4}, { 0, 0, 0, 0}, { 0, 0, 0, 0} };
        Question1_7.reset(matrix, M, N);

        for (int i = 0; i < matrix.length; i++) {
            Assert.assertArrayEquals(exp[i], matrix[i]);
        }
    }
}