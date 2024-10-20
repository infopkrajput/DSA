class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1, mid;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                st = mid;
            } else {
                end = mid;
            }
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = { 3, 5, 3, 2, 0 };
        Solution obj = new Solution();
        System.out.println(obj.peakIndexInMountainArray(nums));
    }
}
