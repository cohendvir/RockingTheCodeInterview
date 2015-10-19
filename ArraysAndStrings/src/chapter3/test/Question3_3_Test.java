package chapter3.test;

import chapter3.code.SetOfStacks;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Created by Dvir on 19/10/2015.
 */
public class Question3_3_Test {

    @Test
    public void testPush() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        Assert.assertEquals("[1, 2, 3]", stacks.toString());
    }

    @Test
    public void testPushWithThreshold() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        Assert.assertEquals("[1, 2, 3][4, 5, 6][7]", stacks.toString());
    }

    @Test
    public void testPop() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        int pop = stacks.pop();
        Assert.assertEquals(3, pop);
    }

    @Test
    public void testPopThreshold() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        int pop = stacks.pop();
        Assert.assertEquals(7, pop);
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.pop();
    }

    @Test
    public void testPopAt() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        int pop = stacks.popAt(0);
        Assert.assertEquals(3, pop);
    }

    @Test
    public void testPopAtThreshold() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        int pop = stacks.popAt(1);
        Assert.assertEquals(6, pop);
    }

    @Test(expected = EmptyStackException.class)
    public void testPopAtEmptyStack() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.pop();
        stacks.popAt(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopAtIndexOutOfBounds() throws Exception {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.popAt(4);
    }
}