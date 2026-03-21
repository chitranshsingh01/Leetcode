class Solution {
   public static int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while(sum>=target){
                minlen=Math.min(minlen, i-k+1);
                sum=sum-nums[k++];
            }

        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        } 
        return minlen;

    }
}
