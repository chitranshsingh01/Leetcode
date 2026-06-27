class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x); 
    }
    
    public int pop() {
        int n1=q1.size();
        for(int i=1;i<n1;i++){
            q1.add(q1.remove());
        }
        return q1.remove();
    }
    
    public int top() {
         int n1=q1.size();
        for(int i=1;i<n1;i++){
            q1.add(q1.remove());
        }
        int ans= q1.peek();
         q1.add(q1.remove()); 
         return ans;
    }
    
    public boolean empty() {
        int n=q1.size();
        if(n>0) return false;
        else return true;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
