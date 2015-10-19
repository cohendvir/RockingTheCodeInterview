package chapter2.test;

import chapter2.code.LinkedListNode;
import chapter2.code.Question2_3;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_3_Test {

    @Test
    public void testDeleteNode1() throws Exception {

        LinkedListNode head = LinkedListNode.toList(1, 2, 3, 4);

        LinkedListNode toRemove = head.next;

        Question2_3.deleteNode(toRemove);

        Assert.assertEquals("1, 3, 4", head.toString());
    }
}