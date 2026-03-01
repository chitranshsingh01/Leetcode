class Solution {
      public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length<3) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]) continue;
             while(j<k){
              if(nums[i]+nums[j]+nums[k]==0){
                // if(i>0 && nums[i]==nums[i-1]) continue;
                     List<Integer> arr=new ArrayList<>();
                arr.add(nums[i]);
                arr.add(nums[j]);
                arr.add(nums[k]);
                // arr2=arr;
                ans.add(arr);
                // if(ans.getLast.equals(arr2)){continue;}
                
                while(k>j&&nums[k]==nums[k-1]){
                    k--;
                }
                while(j<k&&nums[j]==nums[j+1]){
                    j++;
                   
                }
                j++;
                k--;
               }
              else if(nums[i]+nums[j]+nums[k]>0){
                k--;
               }
               else{
                j++;
               }  
          } 
        }
        return ans;
    }
}
