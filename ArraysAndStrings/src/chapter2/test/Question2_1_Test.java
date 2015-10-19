package chapter2.test;

import chapter2.code.LinkedListNode;
import chapter2.code.Question2_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_1_Test {

    @Test
    public void testRemoveDuplicates1() throws Exception {

        LinkedListNode node = LinkedListNode.toList(1, 2, 3, 4, 1, 6);

        Question2_1.uniquify(node);

        Assert.assertEquals("1, 2, 3, 4, 6", node.toString());
    }

    @Test
    public void testRemoveDuplicates2() throws Exception {

        LinkedListNode node = LinkedListNode.toList(1, 2, 3, 4, 1, 1);

        Question2_1.uniquify(node);

        Assert.assertEquals("1, 2, 3, 4", node.toString());
    }

    @Test
    public void testRemoveDuplicates3() throws Exception {

        LinkedListNode node = LinkedListNode.toList(1, 1);

        Question2_1.uniquify(node);

        Assert.assertEquals("1", node.toString());
    }
}