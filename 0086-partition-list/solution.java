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
   public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy2 =new ListNode (-1);
        ListNode a=dummy;
        ListNode b=dummy2;
        ListNode temp =head;
        while(temp!=null){
            if(temp.val<x){
                dummy.next=temp;
                dummy=dummy.next;
            }
            else{
                dummy2.next=temp;
                dummy2=dummy2.next;
            }
            temp=temp.next;
        }
        b=b.next;
        dummy.next=b;
        dummy2.next=null;
        return a.next;
    }
}
