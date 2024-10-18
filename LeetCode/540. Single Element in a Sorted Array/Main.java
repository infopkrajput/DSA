class Solution {
    public int singleNonDuplicate1(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid;

        while (start < end) {
            mid = start + (end - start) / 2;

            // Check if mid is even or odd and compare with its neighbors
            if (mid % 2 == 1) {
                mid--; // If mid is odd, move it back to even index to make the pair
            }

            // If mid and mid + 1 are equal, single element is in the right half
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                // Single element is in the left half
                end = mid;
            }
        }

        // When start == end, the single element is found
        return nums[start];
    }

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int start = 0;
        int end = n - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid == 0 && nums[0] != nums[1]) {
                return nums[mid];
            }
            if (mid == n - 1 && nums[n - 1] != nums[n - 2]) {
                return nums[mid];
            }

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 0) { // Even index
                if (nums[mid - 1] == nums[mid]) { // left side
                    end = mid - 1;
                } else { // right side
                    start = mid + 1;
                }
            } else { // Odd index
                if (nums[mid - 1] == nums[mid]) { // right side
                    start = mid + 1;
                } else { // left side
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        Solution obj = new Solution();
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
