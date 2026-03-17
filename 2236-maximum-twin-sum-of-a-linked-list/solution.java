class Solution {
   public static int pairSum(ListNode head) {
        //count
        int count=0;
        ListNode temp=head;
        ListNode b=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count/2;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        ListNode a=temp.next;
        //reverse 
         ListNode prev=null;
        ListNode curr=a;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        a=prev;
        int max=Integer.MIN_VALUE;

        // 5 4 // 1 2
        while(b!=null && a!=null){
            int c=b.val+a.val;
            max=Math.max(max, c);
            a=a.next;
            b=b.next;
        } 
        return max;
    }
}
