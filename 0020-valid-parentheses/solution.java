import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        String opening="([{";
        String closing=")]}";
        int i=0;
        while(i<n){
            for(int o=0;o<3;o++){
                if(s.charAt(i)==opening.charAt(o)) {
                    stack.push(s.charAt(i));
                break;
                }
            }
            for(int c=0;c<3;c++){
                if(s.charAt(i)==closing.charAt(c)){
                    if(stack.size()!=0&&stack.peek()==opening.charAt(c)) {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
                i++;
        }
        if(stack.isEmpty()) return true;
        else return false;
        
    }
}
