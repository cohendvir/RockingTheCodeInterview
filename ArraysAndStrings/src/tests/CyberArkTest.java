package tests;

import java.util.Stack;

/**
 * Created by Dvir on 13/11/2015.
 */
public class CyberArkTest {

    public static void main(String[] args) {
        new CyberArkTest().solution("");
    }

    public int solution(String s) {

        Stack<Integer> stack = new Stack<>();

        for (char currectChar : s.toCharArray()) {

            if (Character.isDigit(currectChar)) {
                stack.push(Character.getNumericValue(currectChar));
            }
            else if (currectChar == '+' || currectChar == '*') {

                // Validity check
                if (stack.size() < 2) {
                    return -1;
                }

                try {
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    int res = currectChar == '+' ? Math.addExact(n1, n2) : Math.multiplyExact(n1, n2);
                    stack.push(res);
                } catch (ArithmeticException e) {
                    return -1;
                }
            }
        }

        if (stack.isEmpty()) {
            return -1;
        }

        return stack.pop();
    }
}