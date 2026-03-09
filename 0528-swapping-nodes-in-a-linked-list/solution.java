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
        public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while (temp!=null) {
            count++;
            temp=temp.next; 
        }
        int lastidx=count-k+1;
        int firstidx=k;
        ListNode first=head;
        ListNode last=head;
        for (int i = 1; i <firstidx; i++) {
            first=first.next;
        }
        for (int i = 1; i <lastidx; i++) {
            last=last.next;
        }
        int t=first.val;
        first.val=last.val;
        last.val=t;
        return head; 
    }
}
