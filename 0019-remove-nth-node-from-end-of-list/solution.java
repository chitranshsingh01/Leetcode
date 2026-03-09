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
 public static ListNode removeNthFromEnd(ListNode head, int n) {
    if(head.next==null&&n==1){
        head=null;
        return head;
    }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int remove=count-n;
        temp=head;
        for(int i=1;i<remove;i++){
            temp=temp.next;
        }
        if(remove==0){
            head=head.next;
            return head;
        }
        // if(temp==head.next){
        //     head=head.next;
        //     return head;
        // }
        temp.next=temp.next.next;
        return head;
    }
}
