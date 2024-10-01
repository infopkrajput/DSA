class Solution {
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0)
            return 0;
        int leftMost[] = new int[n];
        leftMost[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMost[i] = Math.max(height[i], leftMost[i - 1]);
        }
        int rightMost[] = new int[n];
        rightMost[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMost[i] = Math.max(height[i], rightMost[i + 1]);
        }
        int trappedWater = 0;
        int waterLevel;
        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(leftMost[i], rightMost[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int x = trap(arr);
        System.out.println(x);
    }
}