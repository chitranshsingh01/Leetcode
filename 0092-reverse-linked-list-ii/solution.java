/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode head1=dummy;
        ListNode tail2=dummy;
        for (int i = 0; i <left-1; i++) {
            head1=head1.next;   
        }
       ListNode tail1=head1.next;
        for (int i = 0; i <right; i++) {
            tail2=tail2.next; 
        }
        ListNode head2=tail2.next;
        head1.next=null;
        tail2.next=null;
        reverseList(tail1);
        head1.next=tail2;
        tail1.next=head2;
        return dummy.next; 
    }
      public void reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
    }
}
