import java.util.Arrays;
class Solution {
     public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j] && i!=j) return true;
            else if(nums[i]<nums[j]) i++;
            else j++;
        }
        return false;
    } 
}
