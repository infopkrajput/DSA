class Solution {
    // public static void rotate(int[] nums, int k) {
    //     for (int i = 0; i < k; i++) {
    //         r(nums);
    //     }
    // }

    // public static void r(int[] nums) {
    //     int temp;
    //     int len = nums.length;
    //     temp = nums[len - 1];
    //     for (int i = len - 1; i > 0; i--) {
    //         nums[i] = nums[i - 1];
    //     }
    //     nums[0] = temp;
    // }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle cases where k > n
        
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        for(int num : arr)
        System.out.print(num + " ");
    }
}