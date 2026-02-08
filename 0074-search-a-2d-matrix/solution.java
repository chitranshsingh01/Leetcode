class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int r=(rows*cols)-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            int midrow=mid/cols;
            int midcol=mid%cols;
            if(matrix[midrow][midcol]==target) return true;
            else if(matrix[midrow][midcol]<target) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return false;

    }
}
