class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;

        return (n / 2);

    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums1[] = { 1, 2, 3, 4, 6, 10, 12 };
        int nums2[] = { 2, 3, 6, 15 };
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}
