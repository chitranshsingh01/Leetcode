class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length-1;
        int l=0;
        int r=n;
        int[] ans =new int[]{-1,-1};
        if(nums.length==0) return new int[]{-1,-1};

        while(l<=r){
           int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
        }
        l=0;
        r=n;
          while(l<=r){
           int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
          }
          return ans;
        
    }
}
