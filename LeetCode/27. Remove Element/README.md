## LeetCode Problem: 27. Remove Element

### Problem Statement:
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the new length.
You must do this by modifying the input array in-place with `O(1)` extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.

### Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return length = 2, with the first two elements of nums being 2. It doesn't matter what you leave beyond the returned length (hence they are underscores).

### Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.

### Constraints:
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

### Follow-up:
Can you solve it with `O(1)` extra space?