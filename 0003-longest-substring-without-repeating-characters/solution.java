class Solution {
       public static int lengthOfLongestSubstring(String s){
        int j=0;
        int len=0;
        int k;
        int max=Integer.MIN_VALUE;
        if(s.length()==0) return 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag=false;
            for (k= j; k<=i; k++) {
                if(i<s.length()-1 && s.charAt(i+1)==s.charAt(k)){
                    flag=true;
                    break;
                }
            }
            len=(i-j)+1;
       max=Math.max(max, len);
         if(flag){
                j=k+1;
            } 
           
        }
        return max; 
    }
}
