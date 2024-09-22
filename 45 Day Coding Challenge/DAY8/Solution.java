public class Solution {
    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1)
                max2 = arr[i];
        }
        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8 };
        int n = 5;
        System.out.println("Second largest element: " + findSecondLargest(n, arr));

    }
}