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
 public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length==0) return null;
        ArrayList<ListNode> arr=new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            arr.add(lists[i]);
        }
        while(arr.size()>1){
            ListNode a=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c=merge(a,b);
            arr.add(c);
        } 
        return arr.get(0);   
    }
     public ListNode merge(ListNode list1, ListNode list2) {
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
}
