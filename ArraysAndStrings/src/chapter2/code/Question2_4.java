package chapter2.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_4 {

    public static LinkedListNode partition(LinkedListNode head, Integer x) {

        LinkedListNode lower = null;
        LinkedListNode higher = null;

        while (head != null) {

            if (head.value < x) {
                if (lower == null) {
                    lower = new LinkedListNode(head.value);
                }
                else {
                    lower.add(head.value);
                }
            }
            else {
                if (higher == null) {
                    higher = new LinkedListNode(head.value);
                }
                else {
                    higher.add(head.value);
                }
            }

            head = head.next;
        }

        LinkedListNode pointer = higher;

        if (lower != null) {

            pointer = lower;

            while (lower.next != null) {
                lower = lower.next;
            }

            lower.next = higher;
        }

        return pointer;
    }
}
