class Solution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length()==0 ) return true;
        if(t.length()==0) return false;
        if(s.length()>t.length()) return false;
        int i=0;
        int j=0;
        while(i<=s.length()-1 && j<=t.length()-1){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else j++;
        }
        if(i==s.length()) return true;
        else return false; 
    }
}
