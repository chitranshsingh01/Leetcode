class Solution {
        public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
            stack.push(s.charAt(0));
        for (int i = 1; i <n; i++) {
            char top ='\0';
            if(stack.size()!=0) top=stack.peek();
            if(top==s.charAt(i)) stack.pop();
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        while(stack.size()!=0){
            ans+=stack.pop();
        }
        int l=ans.length();
        String a="";
        for (int i = l-1; i >= 0; i--) {
            a+=ans.charAt(i);
        }
        return a;
    }
}
