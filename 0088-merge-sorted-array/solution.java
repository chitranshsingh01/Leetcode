class Solution {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length;
        int j=0;
        for (int i = 0; i < nums2.length; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
