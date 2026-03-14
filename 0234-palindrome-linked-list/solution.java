class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count/2;
        int[] arr=new int[mid];
        int k=0;
        for(int i=0;i<mid;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        if(count%2!=0) temp=temp.next;
        for(int i=arr.length-1;i>=0;i--){
            if(temp.val!=arr[i]){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}
