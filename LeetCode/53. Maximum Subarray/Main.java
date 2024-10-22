class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;

    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution obj = new Solution();
        System.out.println(obj.maxSubArray(nums));
    }

}