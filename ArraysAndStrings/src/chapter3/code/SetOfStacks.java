package chapter3.code;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Dvir on 19/10/2015.
 */
public class SetOfStacks {

    private Stack<Stack<Integer>> stacks;
    private int threshold;

    public SetOfStacks(int threshold) {
        stacks = new Stack<>();
        this.threshold = threshold;
    }

    public void push(Integer integer) {

        if (stacks.isEmpty() || stacks.peek().size() >= threshold) {
            stacks.push(new Stack<Integer>());
        }

        stacks.peek().push(integer);
    }

    public Integer pop() {

        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }

        return stacks.peek().pop();
    }

    public Integer popAt(int index) {

        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }

        if (stacks.size() <= index) {
            throw new IndexOutOfBoundsException(String.format("Stack side: %d, index givne: %d", stacks.size(), index));
        }

        return stacks.get(index).pop();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Stack<Integer> s : stacks) {
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
