package chapter2.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class LinkedListNode<E> {

    public E value;
    public LinkedListNode next;

    public LinkedListNode(E value) {
        this.value = value;
    }

    public void add(E value) {
        LinkedListNode node = new LinkedListNode(value);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        LinkedListNode<E> n = this;
        while (n.next != null) {
            sb.append(", ").append(n.next.value);
            n = n.next;
        }

        return sb.toString();
    }

    public static <E> LinkedListNode<E> toList(E... values) {

        if (values.length < 1) {
            return null;
        }

        LinkedListNode<E> head = new LinkedListNode<>(values[0]);

        for (int i = 1; i < values.length; i++) {
            head.add(values[i]);
        }

        return head;
    }
}
