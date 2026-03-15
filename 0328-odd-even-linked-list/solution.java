class Solution {
   public ListNode  oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        ListNode dummy2 =new ListNode (-1);
        ListNode a=dummy;
        ListNode b=dummy2;
        ListNode temp =head;
        int count=1;
        while(temp!=null){
            if(count%2!=0){
                dummy.next=temp;
                dummy=dummy.next;
            }
            else{
                dummy2.next=temp;
                dummy2=dummy2.next;
            }
            temp=temp.next;
            count++;
        }
        // a=a.next;
        b=b.next;
        dummy.next=b;
        dummy2.next=null;
        return a.next;
    }
}
