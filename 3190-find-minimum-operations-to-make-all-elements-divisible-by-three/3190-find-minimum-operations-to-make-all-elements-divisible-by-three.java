class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num%3!=0){
                count+=Math.min(num%3,3-(num%3));
            }
        }
        return count;
        
    }
}