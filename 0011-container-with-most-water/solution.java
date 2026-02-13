// import java.util.*;
class Solution {
   public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area= -1;

        while(start<=end){
            int min=Math.min(height[start],height[end]);
            int area2=min*(end-start);
            if(area2>area){
                area=area2;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }  
        }
        return area;
        
    }
}
