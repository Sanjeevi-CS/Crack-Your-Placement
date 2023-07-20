package LikedList;

public class Q7_Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int n = 0;
        int r = 0;
        int m = 1;
        while (temp != null) {
            n = n * 10 + temp.val;
            r = r + temp.val * m;
            m *= 10;
            temp = temp.next;
        }
        return n == r;
    }
}
