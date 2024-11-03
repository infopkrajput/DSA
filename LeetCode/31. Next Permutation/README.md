# 31. Next Permutation

## Problem Statement

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

- For example, for `arr = [1,2,3]`, the following are considered permutations of `arr`: `[1,2,3]`, `[1,3,2]`, `[3,1,2]`, `[2,3,1]`.

The **next permutation** of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted order. If such an arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

- For example, the next permutation of `[1,2,3]` is `[1,3,2]`.
- Similarly, the next permutation of `[2,3,1]` is `[3,1,2]`.
- The next permutation of `[3,2,1]` is `[1,2,3]` (rearranged to the lowest possible order).

The replacement must be **in place** and use only constant extra memory.

### Example 1

Input: nums = [1,2,3]  
Output: [1,3,2]

### Example 2

Input: nums = [3,2,1]  
Output: [1,2,3]

### Example 3

Input: nums = [1,1,5]  
Output: [1,5,1]

### Constraints

- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 100`

[C++]()

[JAVA]()

## My 100 Days Of code Journal

[Day23](https://splashy-zone-afc.notion.site/Day-23-12049fd54d998060b63ef40bea602679?pvs=4) 

[100 Days Of code Journal](https://splashy-zone-afc.notion.site/100-Days-of-Code-Journal-11349fd54d99805f86defe8d1c3b0f78?pvs=4)
