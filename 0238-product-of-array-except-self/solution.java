class Solution {
  public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] post=new int[n];
        int[] pre=new int[n];
        pre[0]=nums[0];
        post[n-1]=nums[n-1];
        for (int i = 1; i <n; i++) {
        pre[i]=nums[i]*pre[i-1];
        }
        for (int i = n-2; i >=0; i--) {
            post[i]=nums[i]*post[i+1];
        }
        for (int i = 0; i <n; i++) {
            int a=1,b=1;
            if(i==0){
                a=1;
               b=post[i+1];
            } 
                
            else if(i==n-1){
                b=1;
                a=pre[i-1];
            } 
            else{
                a=pre[i-1];
                b=post[i+1];
            }
            ans[i]=a*b;
            
        }
        return ans; 
    }
}
