# 852. Peak Index in a Mountain Array

## Problem Statement

An array `arr` is a **mountain** if:

- `arr.length >= 3`
- There exists some `i` with `0 < i < arr.length - 1` such that:
  - `arr[0] < arr[1] < ... < arr[i]`
  - `arr[i] > arr[i+1] > ... > arr[arr.length - 1]`

Given a mountain array `arr`, return the index `i` such that `arr[0] < arr[1] < ... < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`.

You must solve it in `O(log n)` time complexity.

### Example 1

Input: arr = [0,1,0]  
Output: 1

### Example 2

Input: arr = [0,2,1,0]  
Output: 1

### Example 3

Input: arr = [0,10,5,2]  
Output: 1

### Constraints

- `3 <= arr.length <= 10^5`
- `0 <= arr[i] <= 10^6`
- `arr` is **guaranteed** to be a mountain array.

[C++](https://github.com/infopkrajput/DSA/blob/main/LeetCode/852.%20Peak%20Index%20in%20a%20Mountain%20Array/Solution.cpp)

[JAVA](https://github.com/infopkrajput/DSA/blob/main/LeetCode/852.%20Peak%20Index%20in%20a%20Mountain%20Array/Main.java)

## My 100 Days Of code Journal

[Day18](https://splashy-zone-afc.notion.site/Day-18-12049fd54d9980428e8ac90bc170a324?pvs=4)

[100 Days Of code Journal](https://splashy-zone-afc.notion.site/100-Days-of-Code-Journal-11349fd54d99805f86defe8d1c3b0f78?pvs=4)
