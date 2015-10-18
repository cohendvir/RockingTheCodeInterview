package chapter2.test;

import chapter2.code.LinkedListNode;
import chapter2.code.Question2_1;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_1_Test {

    @Test
    public void testRemoveDuplicates1() throws Exception {

        LinkedListNode<Integer> node = new LinkedListNode<>(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(1);
        node.add(6);

        Question2_1.uniquify(node);

        Assert.assertEquals("1, 2, 3, 4, 6", node.toString());
    }

    @Test
    public void testRemoveDuplicates2() throws Exception {

        LinkedListNode<Integer> node = new LinkedListNode<>(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(1);
        node.add(1);

        Question2_1.uniquify(node);

        Assert.assertEquals("1, 2, 3, 4", node.toString());
    }

    @Test
    public void testRemoveDuplicates3() throws Exception {

        LinkedListNode<Integer> node = new LinkedListNode<>(1);
        node.add(1);

        Question2_1.uniquify(node);

        Assert.assertEquals("1", node.toString());
    }
}