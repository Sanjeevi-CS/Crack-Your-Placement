package LikedList;

import java.util.*;

public class Q1_MiddleElement {
    public ListNode middleNode(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        while (t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;
    }
}
