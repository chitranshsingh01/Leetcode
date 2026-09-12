class Solution {
    public String reverseWords(String s) {
        StringBuilder st=new StringBuilder();
        s=s.trim();
        int j=s.length();
        int start=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') continue;
            if(i+1<j){
                st.append(s.substring(i+1,j)).append(" ");
            }
            j=i; 
        }
        st.append(s.substring(0,j));
        return st.toString();
    }
}






















     // s.trim();
        // StringBuilder st=new StringBuilder();
        // int n=s.length()-1;
        // String[] arr = s.trim().split("\\s+");
        // for(int i=arr.length-1;i>=0;i--){
        //     String rev=arr[i];
        //     st.append(rev);
        //    if(i!=0) st.append(" ");
        // }
        // return st.toString();