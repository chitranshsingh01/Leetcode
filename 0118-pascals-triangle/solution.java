class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>(numRows);
        for (int i = 0; i <numRows; i++) {
            List<Integer> row=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                
                row.add(j, 1);  
            }
            arr.add(row);
        }

        for (int i = 0; i <numRows; i++) {
            for (int j = 0; j <=i; j++) {
                if(i==j ||j==0){
                    arr.get(i).set(j,1);
                }
                else{
                    int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).set(j, val);
                }
            }
        } 
        return arr;
    }
}
