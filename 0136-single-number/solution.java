class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
     int n=nums.length-1;
        Arrays.sort(nums);
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n]!=nums[n-1]) return nums[n];
        for (int i = 0; i <=n; i+=2) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;
    }
}
