package LikedList;

public class Q13_Reverse2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null){
            return head;
        }
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode prev=d;
        for(int i=1;i<=left-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=1;i<=right-left;i++){
            ListNode f=curr.next;
            curr.next=f.next;
            f.next=prev.next;
            prev.next=f;
        }
        return d.next;
    }
}
