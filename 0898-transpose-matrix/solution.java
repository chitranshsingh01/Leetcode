class Solution {
 public static int[][] transpose(int[][] nums){
        int a=nums.length;
        int b=nums[0].length;
        int[][] ans=new int[b][a];
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=nums[j][i];
            }  
        }
        return ans;  
    }
}
