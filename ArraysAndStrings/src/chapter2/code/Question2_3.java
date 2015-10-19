package chapter2.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_3 {

    public static void deleteNode(LinkedListNode node) {

        if (node.next != null) {
            node.value = node.next.value;
            node.next = node.next.next;
        }
        else {
            node = null;
        }
    }
}
