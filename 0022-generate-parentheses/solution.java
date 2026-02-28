class Solution {
  public static List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        generate("",0,0,s,n);
        return s;
        
    }
    public static void generate(String s,int l,int r,List<String> ans,int n){
        if(r==n){
            ans.add(s);
            return ;
        }
        if(l<n) generate(s+"(",l+1,r,ans,n);
        if(r<l) generate(s+")",l,r+1,ans,n);
    }
}
