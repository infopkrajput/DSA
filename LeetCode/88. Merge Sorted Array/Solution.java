import java.util.*;
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // System.arraycopy(nums2, 0, nums1, nums1.length, n);

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int num : nums1)
            System.out.print(num + " ");

    }

}