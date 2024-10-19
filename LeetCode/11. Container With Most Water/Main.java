import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int st = 0, end = n - 1, maxWater = 0, area, min, water;
        while (st <= end) {
            // find the water length
            water = end - st;

            // find the height which is minimum
            min = Math.min(height[st], height[end]);

            // Find the area
            area = water * min;

            // find max area
            maxWater = Math.max(area, maxWater);

            // if the starting pointer is small increase the start pointer otherwise last
            // pointer
            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }
        }
        // Return result
        return maxWater;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Solution obj = new Solution();
        System.out.println(obj.maxArea(nums));
    }
}
