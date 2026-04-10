
class Solution {
    public static ListNode removeNodes(ListNode head) {
         //  [5,2,13,3,8]
        ListNode temp=head;
        Stack<ListNode> stack= new Stack<>();


        while(temp!=null){
            // if() stack.push(temp);
             if(stack.size()==0 || temp.val < stack.peek().val) stack.push(temp);
            else{
                while( stack.size()!=0 && stack.peek().val < temp.val ){
                    stack.pop();
                }
                stack.push(temp);
            }
            temp=temp.next;
        }
        ListNode n=null;
        ListNode temp2=n;
        while(stack.size()!=0){
            ListNode a=stack.pop();
            a.next=n;
            temp2=a;
            n=a;
        }
        return temp2; 
    }
}
