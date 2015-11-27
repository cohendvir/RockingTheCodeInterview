package tests;

import jdk.jfr.events.ExceptionThrownEvent;

import java.util.Stack;

/**
 * Created by Dvir on 13/11/2015.
 */
public class CyberArkTest2 {

    public int solution(String s) {

        Stack<Integer> stack = new Stack<>();

        for (char currentChar : s.toCharArray()) {

            MachineCommand command = null;
            try {
                command = MachineCmdFactory.createCommand(currentChar);
            } catch (InvalidCharacterException e) {
                return -1;
            }
            if (!command.execute(stack)) {
                return -1;
            }
        }

        if (stack.isEmpty()) {
            return -1;
        }

        return stack.pop();
    }
}

class MachineCmdFactory {

    public static MachineCommand createCommand(char c) throws InvalidCharacterException {

        if (Character.isDigit(c)) {
            return new DigitCommand(Character.getNumericValue(c));
        }
        else if (c == '+') {
            return new AdditionCommand();
        }
        else if (c == '*') {
            return new MultiplicationCommand();
        }

        throw new InvalidCharacterException();
    }
}

interface MachineCommand {

    boolean execute(Stack<Integer> stack);
}

class DigitCommand implements MachineCommand {

    private int digit;

    public DigitCommand(int digit) {
        this.digit = digit;
    }

    @Override
    public boolean execute(Stack<Integer> stack) {
        stack.push(digit);
        return true;
    }
}

abstract class BasicArithmeticCommand implements MachineCommand {

    public boolean execute(Stack<Integer> stack) {

        if (stack.size() < 2) {
            return false;
        }

        try {
            stack.push(executeArithmeticAction(stack.pop(), stack.pop()));
        } catch (ArithmeticException e) {
            return false;
        }

        return true;
    }

    protected abstract int executeArithmeticAction(Integer pop, Integer integer);
}

class MultiplicationCommand extends BasicArithmeticCommand {

    @Override
    protected int executeArithmeticAction(Integer n1, Integer n2) {
        return Math.multiplyExact(n1, n2);
    }
}

class AdditionCommand extends BasicArithmeticCommand {

    @Override
    protected int executeArithmeticAction(Integer n1, Integer n2) {
        return Math.addExact(n1, n2);
    }
}

class InvalidCharacterException extends Exception {}