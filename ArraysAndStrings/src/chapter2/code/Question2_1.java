package chapter2.code;

import java.util.*;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_1 {

    public static <E> void uniquify(LinkedListNode<E> head) {

        LinkedListNode<E> pointer = head;

        while (pointer != null) {
            LinkedListNode<E> runner = pointer;
            E pointerValue = pointer.value;

            while (runner.next != null) {
                E runnerValue = (E) runner.next.value;

                if (runnerValue != null && runnerValue.equals(pointerValue)) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }

            pointer = pointer.next;
        }
    }
}
