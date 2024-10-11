class Solution {
    public static void sortColors1(int[] nums) {
        int num0, num1, num2;
        num0 = num1 = num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                num0++;
            if (nums[i] == 1)
                num1++;
            if (nums[i] == 2)
                num2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (num0 > 0) {
                nums[i] = 0;
                num0--;
            } else if (num1 > 0) {
                nums[i] = 1;
                num1--;
            } else if (num2 > 0) {
                nums[i] = 2;
                num2--;
            }
        }
    }

    public static void sortColors2(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        sortColors2(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}