class Solution {
    public static int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <n; i++) {
           String s =operations[i];
           if(s.equals("C")){
            stack.pop();
           }
           else if(s.equals("D")){
            int a=stack.peek();
            stack.push(a*2);
           }
           else if(s.equals("+")){
            int a=stack.pop();
            int b=0;
            b=stack.peek();
            stack.push(a);
            stack.push(a+b);
           }
           else{
            int a=Integer.parseInt(s);
            stack.push(a);
           }
        }
        int sum=0;

        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
        
    }

}
