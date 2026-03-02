class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length;  
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[] arr = new int[ans.size()];

for (int o = 0; o < ans.size(); o++) {
    arr[o] = ans.get(o);
}
        return arr;
    }
}
