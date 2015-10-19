package chapter3.test;

import chapter3.code.Question3_6;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by Dvir on 19/10/2015.
 */
public class Question3_6_Test {

    @Test
    public void testSort() throws Exception {

        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(1);
        s.push(10);
        s.push(7);
        s.push(1);
        s.push(3);
        Question3_6.sort(s);

        Assert.assertEquals("[1, 1, 3, 3, 4, 6, 7, 8, 10]", s.toString());
    }
}