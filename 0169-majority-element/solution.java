import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int l=nums.length-1;
        int mid=s+(l-s)/2;
        int ans=nums[mid];
        return ans;
        
    }
}
