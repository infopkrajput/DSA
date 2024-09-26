#include <stdio.h>
int majorityElement(int* nums, int numsSize) {
    int freq = 0, ans = 0;
    for (int i = 0; i < numsSize; i++) {
        if (freq == 0) {
            ans = nums[i];
        }
        if (ans == nums[i]) {
            freq++;
        } else {
            freq--;
        }
    }
    return ans;
}
int main()
{
    int arr[] = {2,2,1,1,1,2,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    int x = majorityElement(arr, n);
    printf("The majority element is %d\n", x);
    return 0;
}