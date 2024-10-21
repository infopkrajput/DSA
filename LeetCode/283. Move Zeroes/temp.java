class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int t;
        while (j <= n - 1) {
            if (nums[i] == 0 && nums[j] != 0) {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            } else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }
    }
}

public class temp {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 0, 0, 2, 3 };
        Solution obj = new Solution();
        obj.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}