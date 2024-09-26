import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        // sort array
        Arrays.sort(nums);
        int frequency = 1, result = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                frequency++;
            } else {
                frequency = 1;
                result = nums[i];
            }
            if (frequency > n / 2) {
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int x = majorityElement(nums);
        System.out.println(x);
    }

}