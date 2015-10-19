package chapter2.code;

import java.util.*;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_1 {

    public static void uniquify(LinkedListNode head) {

        LinkedListNode pointer = head;

        while (pointer != null) {
            LinkedListNode runner = pointer;
            Integer pointerValue = pointer.value;

            while (runner.next != null) {
                Integer runnerValue = runner.next.value;

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
