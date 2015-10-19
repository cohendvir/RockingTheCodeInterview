package chapter2.test;

import chapter2.code.LinkedListNode;
import chapter2.code.Question2_5;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_5_Test {

    @Test
    public void testSum() throws Exception {
        LinkedListNode list1 = LinkedListNode.toList(7, 1, 6);
        LinkedListNode list2 = LinkedListNode.toList(5, 9, 2);
        LinkedListNode res = Question2_5.sum(list1, list2);
        Assert.assertEquals("9, 1, 2", res.toString());
    }

    @Test
    public void testSumList() throws Exception {

        LinkedListNode list1 = LinkedListNode.toList(7, 1, 6);
        int sum1 = Question2_5.sumList(list1);
        Assert.assertEquals(617, sum1);

        LinkedListNode list2 = LinkedListNode.toList(5, 9, 2);
        int sum2= Question2_5.sumList(list2);
        Assert.assertEquals(295, sum2);
    }

    @Test
    public void testSumListForward() {
        LinkedListNode list1 = LinkedListNode.toList(6, 1, 7);
        int sum1 = Question2_5.sumListForward(list1);
        Assert.assertEquals(617, sum1);

        LinkedListNode list2 = LinkedListNode.toList(2, 9, 5);
        int sum2= Question2_5.sumListForward(list2);
        Assert.assertEquals(295, sum2);
    }
}