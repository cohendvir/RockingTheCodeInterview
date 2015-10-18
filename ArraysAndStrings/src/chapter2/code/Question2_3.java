package chapter2.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_3 {

    public static <E> void deleteNode(LinkedListNode<E> node) {

        if (node.next != null) {
            node.value = (E) node.next.value;
            node.next = node.next.next;
        }
        else {
            node = null;
        }
    }
}
