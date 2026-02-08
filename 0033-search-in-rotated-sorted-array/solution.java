class Solution {
    public int search(int[] nums, int target) {
       
       int n=nums.length-1;
       int l=0;
       int r=n;
       int mid=0;
       while(l<=r){
         mid=l+(r-l)/2;
         if(nums[mid]==target){
            return mid;
         }
         if(nums[l]<=nums[mid]){
            //left sorted.
            if(nums[l] <= target && target <= nums[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
         }
        else{
            //rigth sorted.
            if(nums[mid] <= target && target <=nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
       }
       return -1;
    }
}
