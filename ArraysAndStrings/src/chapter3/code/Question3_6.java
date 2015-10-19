package chapter3.code;

import java.util.Stack;

/**
 * Created by Dvir on 19/10/2015.
 */
public class Question3_6 {

    public static void sort(Stack<Integer> stack) {

        Stack<Integer> helper = new Stack<>();

        while (!stack.isEmpty()) {

            int pop = stack.pop();

            if (stack.isEmpty()) {
                helper.push(pop);
            }
            else {

                int peek = stack.peek();
                int value = pop;
                if (peek > pop) {
                    value = stack.pop();
                    stack.push(pop);
                }

                if (!helper.isEmpty() && value > helper.peek()) {
                    while (!helper.isEmpty()) {
                        stack.push(helper.pop());
                    }
                }

                helper.push(value);
            }
        }

        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }
}
