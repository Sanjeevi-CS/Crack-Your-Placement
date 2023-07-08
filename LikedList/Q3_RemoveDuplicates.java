package LikedList;

public class Q3_RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val != temp.next.val) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}
