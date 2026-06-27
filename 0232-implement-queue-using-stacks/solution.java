class MyQueue {

        Stack<Integer> st1;
        Stack<Integer> st2;

    public MyQueue() {
        st1=new Stack<>(); 
        st2=new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        int n=st1.size();
        for(int i=1;i<=n;i++){
            st2.push(st1.pop());
        }
        int ans=st2.pop();
        int n2=st2.size();
        for(int i=1;i<=n2;i++){
            st1.push(st2.pop());
        }
        return ans;
    }
    
    public int peek() {
         int n=st1.size();
        for(int i=1;i<=n;i++){
            st2.push(st1.pop());
        }
        int ans=st2.peek();
        int n2=st2.size();
        for(int i=1;i<=n2;i++){
            st1.push(st2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        int a=st1.size();
        if(a>0)return false;
        else return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
