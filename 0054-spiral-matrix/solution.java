class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int rigth=matrix[0].length-1;
        while(top<=bottom&&left<=rigth){
            for (int i = top; i <=rigth; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i <=bottom; i++) {
                list.add(matrix[i][rigth]);
            }
            rigth--;
            if(top<=bottom){  
                for (int i =rigth; i >=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=rigth){
                for (int i = bottom; i >=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        for (int i : list) {
            System.out.print(i+" ");
        } 
        return list;
    }  
}
