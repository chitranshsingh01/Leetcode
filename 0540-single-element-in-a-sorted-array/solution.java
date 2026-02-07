class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int r=0;
        int l=0;
        int p=0;
        int d=0;
         if(nums.length==1)   return nums[0];
         if(nums[0]!=nums[1]) return nums[0];
         if(nums[end]!=nums[end-1]) return nums[end];
        while(start<=end){
             int mid= start+(end-start)/2;
              if(mid>0&&nums[mid]==nums[mid-1]){
                p=mid-1;
                d=mid;
                l=((p-1)-start)+1;
                r=(end-(d+1))+1;
            }
            if(mid<end && nums[mid]==nums[mid+1]){
                p=mid;
                d=mid+1;
                l=((p-1)-start)+1;
                r=(end-(d+1))+1;
            }
            
            if(mid>0 && mid<nums.length-1 && nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            else if(r%2==0){
                end=p-1;

            }
            else if(l%2==0){
                start=d+1;
            }
          



        }
        return 1;
    }
}
