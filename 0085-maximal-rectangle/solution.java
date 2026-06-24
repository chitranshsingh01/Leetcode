class Solution {

     public static int largestRectangleArea(int[] heights){

        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();
        pse[0]=-1;
        st.push(0);
         for(int i=1;i<=n-1;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek(); 
            st.push(i);
        }
        int maxarea=0;
        for (int i = 0; i < n; i++) {
            int area=heights[i]*(nse[i]-pse[i]-1);
            maxarea=Integer.max(maxarea, area);
        }
        return maxarea;
    }
    public static int maximalRectangle(char[][] matrix) {

    if (matrix == null || matrix.length == 0) return 0;

    int maxarea = 0;

    // Create an int matrix to store heights
    int[][] heights = new int[matrix.length][matrix[0].length];

    // Copy first row
    for (int j = 0; j < matrix[0].length; j++) {
        heights[0][j] = matrix[0][j] - '0';
    }

    // Build heights (same logic as your code)
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {

            if (matrix[i][j] == '1') {
                heights[i][j] = heights[i - 1][j] + 1;
            } else {
                heights[i][j] = 0;
            }
        }
    }

    int[] arr = new int[matrix[0].length];

    // Same logic as your code
    for (int i = matrix.length - 1; i >= 0; i--) {

        for (int j = 0; j < matrix[0].length; j++) {
            arr[j] = heights[i][j];
        }

        int area = largestRectangleArea(arr);
        maxarea = Math.max(maxarea, area);
    }

    return maxarea;
}
}
