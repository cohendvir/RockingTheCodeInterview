package chapter2.test;

import chapter2.code.LinkedListNode;
import chapter2.code.Question2_4;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_4_Test {

    @Test
    public void partition_Test() {

        LinkedListNode list = LinkedListNode.toList(1,3,5,7,9,2,4,6,8);
        int x = 5;
        LinkedListNode partitioned = Question2_4.partition(list, x);
        Assert.assertEquals("1, 3, 2, 4, 5, 7, 9, 6, 8", partitioned.toString());

    }
}