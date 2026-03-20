class MyLinkedList {
       static class Listnode{ //user defines doubly linked list
        int val;
        Listnode next;
        Listnode prev;
        Listnode(int val){this.val=val;};
    }
    Listnode head;
    Listnode tail;
    int size;

    public MyLinkedList() {
         head=null;
         tail=null;
         size=0;
    }

    public int get(int index) {
        if(index<0||index>=size) {
            return -1;
        }
        Listnode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val; 
    }
    
    public void addAtHead(int val) {
        Listnode temp=new Listnode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Listnode temp=new Listnode(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++; 
    }
    
    public void addAtIndex(int index, int val) {
         if(index<0||index>size){
         return ;
         }
         if(index==0){
            addAtHead(val);
            return;
         }
         if(size==index){
            addAtTail(val);
            return;
         }
        else{
            Listnode a=new Listnode(val);
            Listnode temp=head;
            for (int i = 0; i <index-1; i++) {
                temp=temp.next;
            }
            a.next=temp.next;
            a.prev=temp;
            temp.next=a;
            a.next.prev=a;
            size++;
        }
    }
    public void deleteAtIndex(int index) {
    if(index < 0 || index >= size) return;
    if(index == 0){
        head = head.next;
        if(head != null) head.prev = null;
        else tail = null;
    }
    else if(index == size - 1){
        tail = tail.prev;
        if(tail != null) tail.next = null;
        else head = null;
    }
    else{
        Listnode temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    size--;
}
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
