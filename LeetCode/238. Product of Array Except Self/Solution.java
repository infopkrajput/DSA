class Solution {
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1;
        suf[n - 1] = 1;
        // prefix values
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];
        }
        // sufix values
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = nums[i + 1] * suf[i + 1];
        }
        // generate answers
        for (int i = 0; i < n; i++) {
            nums[i] = pre[i] * suf[i];
        }
        return nums;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int sufix = 1;
        for (int i = n - 2; i >= 0; i--) {
            sufix = sufix * nums[i + 1];
            ans[i] *= sufix;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int[] newArr = new int[arr.length];
        newArr = productExceptSelf(arr);
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }
}