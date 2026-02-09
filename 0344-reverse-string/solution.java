class Solution {
     public static void reverseString(char[] s) {
        int n=s.length-1;
        int start=0;
        int end=n;
        while(start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }   
    }
}
