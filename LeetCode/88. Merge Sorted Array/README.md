# 88. Merge Sorted Array

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

### Example 1

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

Output: [1,2,2,3,5,6]

Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

The result of the merge is [1,2,2,3,5,6] with the first 3 elements of nums1 being replaced.

### Example 2

Input: nums1 = [1], m = 1, nums2 = [], n = 0

Output: [1]

Explanation: Since nums2 is empty, nums1 remains [1].

### Example 3

Input: nums1 = [0], m = 0, nums2 = [1], n = 1

Output: [1]

Explanation: The arrays we are merging are [] and [1].

Since nums1 has no elements, we just set nums1 to nums2.

### Constraints

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10^9 <= nums1[i], nums2[j] <= 10^9`

[C++](https://github.com/infopkrajput/DSA/blob/8c5781e069c3281f0defae2965a0da8b9ea5cd80/LeetCode/88.%20Merge%20Sorted%20Array/Solution.cpp)

[JAVA](https://github.com/infopkrajput/DSA/blob/8c5781e069c3281f0defae2965a0da8b9ea5cd80/LeetCode/88.%20Merge%20Sorted%20Array/Solution.java)

## My 100 Days Of code Journal

[Day9](https://splashy-zone-afc.notion.site/Day-9-11349fd54d99816d89c1d1d261cab6cb?pvs=74)

[100 Days Of code Journal](https://splashy-zone-afc.notion.site/100-Days-of-Code-Journal-11349fd54d99805f86defe8d1c3b0f78?pvs=4)