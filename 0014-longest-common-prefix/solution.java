class Solution {
    public static String longestCommonPrefix(String[] strs) {

        String a=strs[0];
        String ans="";
        for (int i = 0; i<a.length(); i++) {
            char ch=a.charAt(i);
            for (int j = 1; j <strs.length; j++) {

                if(i>=strs[j].length() || ch!=strs[j].charAt(i) ){
                    return ans;
                } 
            }
            ans+=ch; 
        }
        return ans;
     
    }
}
