class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArray[] = new int[nums1.length + nums2.length];
        int st = 0;
        int e = newArray.length - 1;
        while (st<=e) {
            if(nums1[st] < nums2[st])
            {
                newArray[st] = nums1[st];
                st++;
            }
            else
            {
                newArray[st] = nums2[st];
                st++;
            }
        }

        return (e/ 2);

    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums1[] = { 2, 2, 4, 4 };
        int nums2[] = { 2, 2, 2, 4, 4 };
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}
