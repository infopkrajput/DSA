class Solution {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 5;
        int x = searchInsert(arr, target);
        System.out.println(x);
    }
}