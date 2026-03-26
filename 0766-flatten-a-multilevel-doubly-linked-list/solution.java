class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr=head;
        while(curr!=null){
              if(curr.child!=null){
            Node childhead=flatten(curr.child);
            Node a=curr.next;
            curr.next=childhead;
            childhead.prev=curr;
            while(childhead.next!=null) childhead=childhead.next;
            childhead.next=a;
            if(a!=null) a.prev=childhead;
            curr.child=null;
        }
        curr=curr.next;
        }
        return head;
    }
}
