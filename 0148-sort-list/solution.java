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
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode k=new ListNode(-1);
        ListNode d=k;
        while(i!=null&&j!=null){
            if(i.val<=j.val){
                ListNode temp=new ListNode(i.val);
                k.next=temp;
                k=k.next;
                i=i.next;
            }
            else{
                ListNode temp=new ListNode(j.val);
                k.next=temp;
                k=k.next;
                j=j.next;
            }
        }
        if(i!=null){
            k.next=i;
        }
        if(j!=null){
            k.next=j;
        }
        return d.next;  
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        temp=head;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        ListNode a=temp.next;
        temp.next=null;
        ListNode dummy=head;
       ListNode b= sortList(dummy);
       ListNode c= sortList(a);
        return mergeTwoLists(b,c);
    }
}
