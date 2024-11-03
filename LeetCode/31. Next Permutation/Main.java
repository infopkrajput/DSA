class Solution {
    public void nextPermutation(int[] nums) {
        int checkPoint = -1;
        int n = nums.length;
        int t;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                checkPoint = i;
                break;
            }
        }
        if (checkPoint == -1) {
            reverse(nums, 0, n - 1);
        } else {
            for (int i = n - 1; i > checkPoint; i--) {
                if (nums[i] > nums[checkPoint]) {
                    t = nums[i];
                    nums[i] = nums[checkPoint];
                    nums[checkPoint] = t;
                    break;
                }
            }
            reverse(nums, checkPoint + 1, n - 1);
        }
    }

    public void reverse(int[] nums, int st, int end) {
        int t;
        while (st <= end) {
            t = nums[st];
            nums[st] = nums[end];
            nums[end] = t;
            st++;
            end--;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = { 1, 2, 3 };
        obj.nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}