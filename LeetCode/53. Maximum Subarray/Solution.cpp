#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int n = nums.size();
        int curSum = 0;
        int maxSum = INT_MIN;
        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
};
int main()
{
    vector<int> nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution obj;
        cout << obj.maxSubArray(nums)<<endl;
    return 0;
}