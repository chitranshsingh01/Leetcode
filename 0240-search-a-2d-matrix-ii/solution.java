class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(j<matrix[0].length && j>=0 && i<matrix.length && i>=0){
            if(matrix[i][j]==target){   
                return true;    
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
