package chapter2.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question2_5 {

    public static LinkedListNode sum(LinkedListNode num1List, LinkedListNode num2List) {

        int sum = sumList(num1List) + sumList(num2List);

        LinkedListNode head = new LinkedListNode(sum % 10);
        sum /= 10;

        while (sum > 0) {
            int n = sum % 10;
            sum /= 10;

            LinkedListNode node = new LinkedListNode(n);
            node.next = head;
            head = node;
        }


        return head;
    }

    public static int sumList(LinkedListNode list) {

        int sum = 0;
        int index = 0;

        while (list != null) {
            sum += Math.pow(10, index) * list.value;
            list = list.next;
            index++;
        }

        return sum;
    }

    public static int sumListForward(LinkedListNode list) {

        int sum = 0;

        while (list != null) {
            sum *= 10;
            sum += list.value;
            list = list.next;
        }

        return sum;
    }
}
